package com.rmi.contract.greetingservice.model;

import java.io.Serializable;

/**
 * @author Eyüp Akay
 */
public class GreetingRequest implements Serializable {

    private String name;

    public GreetingRequest() {
    }

    public GreetingRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
