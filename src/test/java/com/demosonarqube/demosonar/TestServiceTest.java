package com.demosonarqube.demosonar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestServiceTest {
    @Autowired
    private TestService testService;

    @Test
    public void helloTest(){
        Assertions.assertEquals("Hello, John", testService.hello("John"));
    }
   
    
    @Test
    public void helloTest2John2(){
        Assertions.assertEquals("Hello, John2, John", testService.hello2("John2"));
    }
    
    @Test
    public void helloTest2John(){
        Assertions.assertEquals("Hello, John", testService.hello2("John"));
    }
}
