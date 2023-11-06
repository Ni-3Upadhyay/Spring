package com.Autowiring;

public class depended {
    private needed needed;

    public needed getNeeded() {
        return needed;
    }

    public void setNeeded(needed needed) {
        System.out.println("Setter injection is called");
        this.needed = needed;
    }

    public depended(needed needed){
        this.needed = needed;
    }

    public String toString(){
        return "String : " + needed;
    }
}
