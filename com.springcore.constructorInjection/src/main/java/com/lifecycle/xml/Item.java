package com.lifecycle.xml;

public class Item {
    private double price;

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        System.out.println("Setting property ");
        this.price = price;
    }

    public Item(){
        super();
    }

    public String toString(){
        return "Item : " + price;
    }

    public void init(){                             // is initialisation method (method name can be changes but signature must be same
        System.out.println("Inside init method");   // we need to tell about this initialisation method in xml file
    }

    public void destroy(){                          // is destroy method (method name can be changes but signature must be same
        System.out.println("Inside Destroy method");// we need to tell about this destroy method in xml file but it is not sufficient .
    }                                               // so we need to enable registerShutdownHook method in AbstractApplicationContext
                                                    // because ApplicationContext interface does not have this property. This property is in
                                                    // its parent class that is AbstractApplicationContext.
}
