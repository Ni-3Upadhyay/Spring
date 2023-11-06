package com.Scope;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Scope("prototype")                 // @Scope("prototype") annotation creates diffrent object everytime it is called
public class Annotation {           // @Scope("Singleton") by default gives same object everytime it is called

    @Value("Nitin Upadhyay")
    private String name;
    @Value("#{address}")
    private List<String> Address;

    public void setAddress(List<String> address) {
        this.Address = address;
    }

    public List<String> getAddress() {
        return Address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){

        return "name : " + name + " : "+ Address;
    }
}
