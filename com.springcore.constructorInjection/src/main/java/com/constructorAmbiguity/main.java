package com.constructorAmbiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String [] args){
        ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
        addition add =(addition) context.getBean("add");

        add.doSum();
    }
}
