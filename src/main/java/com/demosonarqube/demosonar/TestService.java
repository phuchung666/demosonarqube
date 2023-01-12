package com.demosonarqube.demosonar;

import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.StringJoiner;

@Service
public class TestService {
    public String hello(String name){
        StringJoiner stringJoiner = new StringJoiner(", ");
        if (Objects.nonNull(name)){
            stringJoiner.add("Hello");
            stringJoiner.add(name);
        } else {
            stringJoiner.add("Hello");
            stringJoiner.add("Anonymous");
        }

        if ("John".equals(name))
            stringJoiner.add("John");
        
        return stringJoiner.toString();
    }
    
    public String hello2(String name){
        StringJoiner stringJoiner = new StringJoiner(", ");
        if (Objects.nonNull(name)){
            stringJoiner.add("Hello");
            stringJoiner.add(name);
        } else {
            stringJoiner.add("Hello");
            stringJoiner.add("Anonymous");
        }

        return stringJoiner.toString();
    }
}
