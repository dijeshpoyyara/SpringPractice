package com.dijesh.spring.springcore.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testMap {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("mapConfig.xml");
        Customer bean = (Customer) context.getBean("cust");
        System.out.println(bean);
    }
}
