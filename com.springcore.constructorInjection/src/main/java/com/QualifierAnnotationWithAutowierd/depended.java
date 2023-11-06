package com.QualifierAnnotationWithAutowierd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class depended {

    @Autowired
    @Qualifier("N2")
    private needed needed;

    public needed getNeeded(){
        return needed;
    }

    public void setNeeded(needed needed){
        this.needed = needed;
    }

    public depended(needed needed){
        this.needed = needed;
    }

    public String toString(){
        return "depended : " + needed;
    }
}
