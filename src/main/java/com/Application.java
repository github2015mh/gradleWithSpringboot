package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2017/1/18.
 */
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
public class Application  {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
