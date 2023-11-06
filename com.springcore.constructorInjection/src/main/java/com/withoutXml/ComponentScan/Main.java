package com.withoutXml.ComponentScan;

import com.withoutXml.ComponentScan.BeanClass;
import com.withoutXml.ComponentScan.JavaConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String [] args){

        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        BeanClass object = context.getBean("bean", BeanClass.class);
        System.out.println(object);
        object.notUsing();
    }

}
