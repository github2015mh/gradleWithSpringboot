package com.test;

import com.module.service.TestService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2017/2/7.
 */
public class MyTest extends BaseJunitTest{

    @Autowired
    private TestService testService;

    @Test
    public void test(){
        System.out.println(testService.test());
    }
}
