package com.Scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

    public static void main(String [] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("scope.xml");
        Annotation object1 = context.getBean("annotation", Annotation.class);

        System.out.println(object1);

        System.out.println(object1.hashCode());
        Annotation object2 = context.getBean("annotation", Annotation.class);

        System.out.println(object2);

        System.out.println(object2.hashCode());

        ScopeUsingXml Xmlobj1 = context.getBean("marks", ScopeUsingXml.class);
        System.out.println(Xmlobj1);
        System.out.println(Xmlobj1.hashCode());


        ScopeUsingXml Xmlobj2 = context.getBean("marks", ScopeUsingXml.class);
        System.out.println(Xmlobj2);
        System.out.println(Xmlobj2.hashCode());
    }


}
