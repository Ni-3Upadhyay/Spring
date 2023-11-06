package com.Autowiring;

public class needed {
    private int need1;
    private int need2;

    private String need3;

    public int getNeed1() {
        return need1;
    }

    public int getNeed2() {
        return need2;
    }

    public String getNeed3() {
        return need3;
    }

    public void setNeed1(int need1) {
        this.need1 = need1;
    }

    public void setNeed2(int need2) {
        this.need2 = need2;
    }

    public void setNeed3(String need3) {
        this.need3 = need3;
    }

    public needed(){
        super();
    }

    public needed(int need1, int need2, String need3){
        this.need1 = need1;
        this.need2 = need2;
        this.need3 = need3;
    }

    public String toString(){
        return need3+ " : " + need2 + " : " + need1;
    }
}
