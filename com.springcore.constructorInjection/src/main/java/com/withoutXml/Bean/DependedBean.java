package com.withoutXml.Bean;

import com.StereotypeAnnotation.Student;

public class DependedBean {

    private NeededBean needed;

    public DependedBean(NeededBean needed){
        super();
        this.needed = needed;
    }

//    public DependedBean(){
//        super();
//    }

    public void student(){
        this.needed.Needed();
        System.out.println("This is the depended class");
    }
}
