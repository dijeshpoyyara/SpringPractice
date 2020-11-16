package com.dijesh.spring.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testProperties {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("propertiesConfig.xml");
        CountriesAndLangauges bean = (CountriesAndLangauges)context.getBean("cAndL");
        System.out.println(bean );
    }
}
