package com.dijesh.spring.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("setConfig.xml");
        CarDealer bean = (CarDealer) context.getBean("carDealer");
        System.out.println(bean.getName()+"  + "+bean.getModels());
    }
}
