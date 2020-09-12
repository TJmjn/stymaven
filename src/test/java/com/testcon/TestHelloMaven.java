package com.testcon;

import com.controller.HelloMaven;
import org.junit.Assert;

import org.junit.Test;


public class TestHelloMaven {
    @Test
    public void testAdd(){
        HelloMaven helloMaven = new HelloMaven();
        int res = helloMaven.add(10,1000);
        //验证10+1000，junit提供的方法，对比结果的
        //assertEquals(期望值，实际值)，如果两个值相等，是正确的。，不等会抛异常
        Assert.assertEquals(1010,res);

    }


}
