package com.test;

import com.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.embedded.EmbeddedWebApplicationContext;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2017/2/7.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
//@WebIntegrationTest //("server.port:0")
//@ContextConfiguration(locations = {"/spring/spring.xml"})
public class BaseJunitTest {
//    @Autowired
//    EmbeddedWebApplicationContext server;
//
//    @Value("${server.port}")
//    int port;

    @Test
    public void test(){
        System.out.println("ok");
    }
}
