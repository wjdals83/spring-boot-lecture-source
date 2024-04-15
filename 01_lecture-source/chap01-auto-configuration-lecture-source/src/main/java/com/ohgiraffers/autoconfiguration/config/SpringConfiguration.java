package com.ohgiraffers.autoconfiguration.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class SpringConfiguration {

    @Value("${test.value}")
    private String value;

    @Value("${test.list}")
    private String[] list;

    @Value("${test.greeting}")
    private String greeting;

    @Value("${test.array1}")
    private String[] array;

    @Value("${username}")
    private String username;

    @Bean
    public Object propertyReadTest() {

//        System.out.println("value = " + value);

//        System.out.println("list = " + list);

//        list.forEach(System.out::println);
//        Arrays.stream(array).forEach(System.out::println);       // 반복문을 짧게 만든 문법이라고만 생각
//
//        System.out.println("greeting = " + greeting);             // 야맬보다 프로퍼티 파일이 우선순위

        System.out.println("username = " + username);


        return new Object();
    }

}
