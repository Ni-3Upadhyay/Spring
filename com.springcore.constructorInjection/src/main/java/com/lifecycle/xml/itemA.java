package com.lifecycle.xml;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class itemA implements InitializingBean, DisposableBean {   // no need to tell the xml file about initialising bean and Disposable bean
    private double price;

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public itemA(){
        super();
    }

    public String toString(){
        return "price : " + this.price;
    }

    @Override
    public void afterPropertiesSet() throws Exception {         // init method is created
        System.out.println("Initialising method");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Going to free the resources");      // destroy method is created
    }
}
