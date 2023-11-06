package com.AutowiringUsingAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

    public static void main(String [] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("autoAnnotation.xml");
        depended variable = (depended) context.getBean("de");

        System.out.println(variable);
    }


}
