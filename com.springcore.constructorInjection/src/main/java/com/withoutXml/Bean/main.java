package com.withoutXml.Bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
    public static void main(String [] args){
        ApplicationContext context =new AnnotationConfigApplicationContext(JavaConfig.class);
        DependedBean object1 =  context.getBean("dependedBean", DependedBean.class);

        System.out.println(object1);
        object1.student();
    }


}
