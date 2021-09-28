package com.rmi.contract.greetingservice.model;


import com.rmi.lib.base.model.BaseResponse;

import java.io.Serializable;

/**
 * @author Eyüp Akay
 */
public class GreetingResponse extends BaseResponse implements Serializable {

    private String greetingMessage;

    public GreetingResponse() {
    }

    public GreetingResponse(String greetingMessage) {
        this.greetingMessage = greetingMessage;
    }

    public String getGreetingMessage() {
        return greetingMessage;
    }

    public void setGreetingMessage(String greetingMessage) {
        this.greetingMessage = greetingMessage;
    }
}
