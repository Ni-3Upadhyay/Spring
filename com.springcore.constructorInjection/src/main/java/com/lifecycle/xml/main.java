package com.lifecycle.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String [] args){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("item.xml");
        Item item1= (Item) context.getBean("item1");

        context.registerShutdownHook();         // this method is called so that our given destroy method is called
                                                // but this method is not available in ApplicationContext so AbstractApplicationContext is used.
        System.out.println(item1);

        System.out.println("\n******************************************************************\n");

        itemA item2 = (itemA) context.getBean("item2");
        System.out.println(item2);

        System.out.println("\n**********************************************************************\n");
        ItemB item3 = (ItemB) context.getBean("item3");
        System.out.println(item3);
    }
}
