package com.StandaloneCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main
{
    public static void main(String [] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("standalone.xml");
        person variable = context.getBean("friend1", person.class);

        System.out.println(variable);
        variable = context.getBean("friend2", person.class);
        System.out.println(variable);

       System.out.print(variable.getFriends().getClass().getName());     // to know the class of String

    }
}
