//package com.soeasy.study;
//
//import com.caucho.v5.autoconf.spring.IncludeSpring;
//
//import com.caucho.v5.config.Configs;
//import com.caucho.v5.web.webapp.WebAppBuilder;
//import io.baratine.config.Config;
//import io.baratine.config.Include;
//import io.baratine.service.Service;
//import io.baratine.web.*;
//
//import javax.inject.Inject;
//import java.util.logging.Logger;
//
///**
// * Author:hermit CreateDate:16/10/10
// */
//@Service
//public class HelloService {
//
//    private Logger logger = Logger.getLogger(HelloService.class.getName());
//
//    @Service
//    @Inject
//    private TestService testService;
//
//    @Get("/hello/{test}")
//    public void doHello(@Path("test") String test, RequestWeb request) {
//        System.out.println(testService.test());
//
//        request.ok("hello");
//
//    }
//
//    public static void main(String[] args) throws Exception {
//
//        Web.include(HelloService.class);
//
//        Web.start();
//
//        // Web.go(args);
//
//    }
//}
