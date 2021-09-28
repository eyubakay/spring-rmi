package com.rmi.greetingservice.service.impl;

import com.google.gson.Gson;
import com.rmi.contract.greetingservice.model.GreetingRequest;
import com.rmi.contract.greetingservice.model.GreetingResponse;
import com.rmi.contract.greetingservice.service.GreetingService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;


/**
 * @author Eyüp Akay
 */
public class GreetingServiceImpl implements GreetingService {

    private Logger logger = Logger.getLogger(this.getClass().getName());
    @Autowired
    private Gson gson;

    public void setGson(Gson gson) {
        this.gson = gson;
    }

    @Override
    public GreetingResponse handshake(GreetingRequest request) {
        logger.info("GreetingServiceImpl::handshake" + gson.toJson(request));

        GreetingResponse response = new GreetingResponse();
        if (Objects.isNull(request.getName()) || request.getName().isEmpty()) {
            response.setStatus(false);
            response.setMessage("FAIL, Ahh!! kamon who is this.");
        }

        response.setGreetingMessage("Hello! " + request.getName());
        response.setMessage("SUCCESS");
        response.setStatus(true);

        return response;
    }
}
