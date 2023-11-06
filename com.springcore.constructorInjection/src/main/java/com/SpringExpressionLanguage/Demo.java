package com.SpringExpressionLanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo{
    @Value("#{33+66}")          // to call a normal expression we use #{expression}
    private int id;

   @Value("#{T(java.lang.Math).sqrt(25)}")      // to call a static method we use : #{ T(class).methodName(parameter)}
    private double method;

   @Value("#{T(java.lang.Math).E}")             // to call a static variable we use : #{ T(class).variable}
    private float variable;

   @Value("#{new java.lang.Integer(56)}")           // to create an object use : #{ new className('value')}
   private int object;

   @Value("#{ 8 > 5}")                           // expression for boolean value
   private boolean isActive;                    // it will give true or false

    @Value("#{4<9?'M':'F'}")                // any type of expression can be called using : #{ expression }
    private char gender;

    public double getMethod() {
        return method;
    }

    public void setMethod(double method) {
        this.method = method;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public char getGender() {
        return gender;
    }

    public String toString(){
        return "expression output : " + method + " : " + gender + " : " + id + " : " + variable+ " : " + object + " : " + isActive;
    }
}
