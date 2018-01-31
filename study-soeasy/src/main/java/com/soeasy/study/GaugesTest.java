package com.soeasy.study;

import com.codahale.metrics.*;
import com.soeasy.data.TestMetrics;
import metrics_influxdb.HttpInfluxdbProtocol;
import metrics_influxdb.InfluxdbProtocol;
import metrics_influxdb.InfluxdbReporter;
import org.hashids.Hashids;
import org.springframework.util.StringUtils;


import java.security.MessageDigest;
import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * Author:hermit
 * CreateDate:18/1/11
 */
public class GaugesTest {

    private static TestMetrics testMetrics = new TestMetrics();

    private static Map<String, String> result = new HashMap<>();

    public static String gbEncoding(final String gbString) {   //gbString = "测试"
        char[] utfBytes = gbString.toCharArray();   //utfBytes = [测, 试]
        String unicodeBytes = "";
        for (int byteIndex = 0; byteIndex < utfBytes.length; byteIndex++) {
            String hexB = Integer.toHexString(utfBytes[byteIndex]);   //转换为16进制整型字符串
            if (hexB.length() <= 2) {
                hexB = "00" + hexB;
            }
            unicodeBytes = unicodeBytes + "\\u" + hexB;
        }
        System.out.println("unicodeBytes is: " + unicodeBytes);
        return unicodeBytes;
    }

    public GaugesTest() {
        super();
    }

    public static String decodeUnicode(final String dataStr) {
        int start = 0;
        int end = 0;
        final StringBuffer buffer = new StringBuffer();
        while (start > -1) {
            end = dataStr.indexOf("\\u", start + 2);
            String charStr = "";
            if (end == -1) {
                charStr = dataStr.substring(start + 2, dataStr.length());
            } else {
                charStr = dataStr.substring(start + 2, end);
            }
            char letter = (char) Integer.parseInt(charStr, 16); // 16进制parse整形字符串。
            buffer.append(new Character(letter).toString());
            start = end;
        }
        return buffer.toString();
    }

    public static String charsToHex(char[] chars) {
        StringBuffer sb = new StringBuffer();

        for (char each : chars) {
            System.out.println(each);
            System.out.println((int) each);
            sb.append(Integer.toHexString((int) each));
        }

        return sb.toString();
    }


    public static void main(String[] args) throws Exception {

        MetricRegistry registry = new MetricRegistry();
        ScheduledReporter scheduledReporter = influxdbReporter(registry);
        ConsoleReporter reporter = ConsoleReporter.forRegistry(registry).build();
        reporter.start(1,TimeUnit.SECONDS);
        registry.register("test_abc", new Gauge<String>() {
            @Override
            public String getValue() {
                return null;
            }
        });
        scheduledReporter.report();
    }

    public static ScheduledReporter influxdbReporter(MetricRegistry metrics) throws Exception {

        InfluxdbProtocol protocol = new HttpInfluxdbProtocol("192.168.100.9", 8086, "", "", "db1");

        return InfluxdbReporter.forRegistry(metrics)
                .protocol(protocol)
                .convertRatesTo(TimeUnit.SECONDS)
                .convertDurationsTo(TimeUnit.MILLISECONDS)
                .filter(MetricFilter.ALL)
                .skipIdleMetrics(false)
                .build();
    }

}
