package com.demosonarqube.demosonar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AnotherServiceTest {
    @Autowired
    private AnotherService testService;

    @Test
    public void helloTest(){
        Assertions.assertEquals("Hello, John", testService.hello("John"));
    }
  
    @Test
    public void helloTestNull(){
        Assertions.assertEquals("Hello, Anonymous", testService.hello(null));
    }
}
