package com.construcorFirst;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Person person1 =(Person) context.getBean("per1");

        System.out.println(person1);
    }
}
