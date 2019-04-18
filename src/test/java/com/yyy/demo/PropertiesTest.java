package com.yyy.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
public class PropertiesTest {
    @Value("${server.port}")
    private String port;

    @Test
    public void testSingle() {
        System.out.print(port);
    }

}