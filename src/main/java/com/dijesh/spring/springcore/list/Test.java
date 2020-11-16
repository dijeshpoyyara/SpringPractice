package com.dijesh.spring.springcore.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("listConfig.xml");
        Hospital bean = (Hospital)context.getBean("hospital");
        System.out.println(bean.getName());
        System.out.println(bean.getDepartments());
    }
}
