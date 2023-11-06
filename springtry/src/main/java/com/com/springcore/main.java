package com.com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String [] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("reference.xml");
        ReferenceA a = (ReferenceA) context.getBean("rA");

        System.out.println(a.getObj().getY());          // to call the variable inside another class
        System.out.println(a.getX());
    }
}
