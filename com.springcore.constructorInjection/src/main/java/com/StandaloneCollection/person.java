package com.StandaloneCollection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class person {
    private List<String> friends;
    private Map<String, Integer> feeStructure;

    private Properties props;

    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    public Map<String, Integer> getFeeStructure(){
        return feeStructure;
    }

    public void setFeeStructure(Map<String, Integer> feeStructure){
        this.feeStructure = feeStructure;
    }

    public void setFriends(List<String> friends){
        this.friends = friends;
    }

    public List<String> getFriends(){
        return getFriends();
    }

    public String toString(){
        return "Friends : " + friends + feeStructure + props;
    }
}
