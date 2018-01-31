package com.soeasy.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author:hermit
 * CreateDate:18/1/16
 */


@RestController
@SpringBootApplication
public class SpringBootTest {

    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        return "ok";
    }

    public static void main(String []args) {
        SpringApplication application = new SpringApplication(SpringBootTest.class);
        application.run();
    }
}
