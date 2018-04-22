package com.example.demo;

import com.example.demo.property_test.YmlReadDemo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    YmlReadDemo propertiesTest;
    @Autowired
    Environment environment;
    @Test
    public void contextLoads() {
        //System.out.println(propertiesTest.getStr());
        System.out.println(environment.getProperty("myProp.str"));
    }

}
