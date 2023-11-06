package com.lifecycle.xml;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ItemB {
    private int price;

    public int getPrice(){
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String toString(){
        return "Price : " + this.price;
    }

    @PostConstruct
    // this annotation was present up to java-8 after that we need to add a dependency to use this annotation
    public void Start(){     // these annotation are byDefault disabled so we need to enable them in our Xml file
        System.out.println("is our init function but annotation are required");
    }

    @PreDestroy
    // this annotation was present upto java-8 after that we need to add a dependency to use this annotation
    public void end(){
        System.out.println("is our destroy function but annotation are required");
    }


}
