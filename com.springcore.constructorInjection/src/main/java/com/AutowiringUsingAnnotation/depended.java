package com.AutowiringUsingAnnotation;

import org.springframework.beans.factory.annotation.Autowired;

public class depended{

    private needed needed;

    public needed getNeeded(){
        return needed;
    }

    @Autowired
    public void setNeeded(needed needed)
    {
        System.out.println("annotation at Setter method is used");
        this.needed = needed;
    }


    public depended(needed needed)
    {
        System.out.println("annotation at constructor is used");
        this.needed = needed;
    }

//    public depended (){
//        super();
//    }

    public String toString(){
        return "Depended : " + needed;
    }
}