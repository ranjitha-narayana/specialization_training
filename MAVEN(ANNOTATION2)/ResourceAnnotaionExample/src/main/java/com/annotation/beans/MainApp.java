package com.annotation.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Employee e1= context.getBean("myemployee",Employee.class);
       System.out.println(e1.toString());
    }
}
