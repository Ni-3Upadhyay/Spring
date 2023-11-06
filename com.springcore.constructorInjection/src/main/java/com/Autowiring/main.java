package com.Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String [] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("auto.xml");
        depended depend =(depended) context.getBean("de");

        System.out.println(depend);
    }

}
