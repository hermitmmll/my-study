package com.soeasy.study;


import org.apache.commons.httpclient.*;
import org.apache.commons.httpclient.auth.AuthScope;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;


import java.util.ArrayList;
import java.util.List;

/**
 * Author:hermit
 * CreateDate:16/10/31
 */
public class RabbitmqUtils {


    public static String executeGet(String url) throws Exception {
        HttpClient httpClient = new HttpClient();
        //需要验证
        UsernamePasswordCredentials creds = new UsernamePasswordCredentials("soeasy", "soeasy");
        httpClient.getState().setCredentials(AuthScope.ANY, creds);

        //设置http头
        List <Header> headers = new ArrayList <Header>();
        //headers.add(new Header("User-Agent", "Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 5.1)"));
        //httpClient.getHostConfiguration().getParams().setParameter("http.default-headers", headers);

        GetMethod method = new GetMethod(url);
        method.setDoAuthentication(true);
        method.getParams().setParameter(HttpMethodParams.RETRY_HANDLER,
                new DefaultHttpMethodRetryHandler(3, false));
        try {
            int statusCode = httpClient.executeMethod(method);
            if (statusCode != HttpStatus.SC_OK) {
                System.out.println("Method failed code="+statusCode+": " + method.getStatusLine());

            } else {
                System.out.println(new String(method.getResponseBody(), "utf-8"));
            }
        } finally {
            method.releaseConnection();
        }

        return null;
    }

    public static void main(String []args) throws  Exception{

        String url = "http://192.168.10.15:15672/api/queues";

        executeGet(url);





    }
}
