package com.withoutXml.ComponentScan;

import org.springframework.stereotype.Component;

@Component("bean")                      // to create an object of a class
public class BeanClass {
    public void notUsing(){
        System.out.println("Not using an Xml file we will create a java file which will have all the configuration");
    }
}
