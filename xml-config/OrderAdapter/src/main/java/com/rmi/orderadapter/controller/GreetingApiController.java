package com.rmi.orderadapter.controller;

import com.google.gson.Gson;
import com.rmi.contract.greetingservice.model.GreetingRequest;
import com.rmi.contract.greetingservice.model.GreetingResponse;
import com.rmi.contract.greetingservice.service.GreetingService;
import com.rmi.orderadapter.api.GreetingApi;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Eyüp Akay
 */
@RestController
public class GreetingApiController implements GreetingApi {

    private Logger logger = Logger.getLogger(this.getClass().getName());

    @Autowired
    private GreetingService greetingService;
    @Autowired
    private Gson gson;

    @Override
    public ResponseEntity<GreetingResponse> handshake(GreetingRequest request) {
        logger.info(gson.toJson(request));
        return new ResponseEntity<>(greetingService.handshake(request), HttpStatus.OK);
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void setGson(Gson gson) {
        this.gson = gson;
    }
}
