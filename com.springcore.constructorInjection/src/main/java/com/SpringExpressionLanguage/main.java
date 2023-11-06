package com.SpringExpressionLanguage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class main {
    public static void main(String [] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("expression.xml");
        Demo object = context.getBean("demo", Demo.class);

        System.out.println(object);

//        Another way to parse Expression means using SpringExpressionLanguage

        SpelExpressionParser exp = new SpelExpressionParser();
        Expression obj =exp.parseExpression("23+670");

        System.out.println(obj.getValue());
    }
}
