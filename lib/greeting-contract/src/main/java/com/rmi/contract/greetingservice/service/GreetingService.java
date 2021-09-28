package com.rmi.contract.greetingservice.service;

import com.rmi.contract.greetingservice.model.GreetingRequest;
import com.rmi.contract.greetingservice.model.GreetingResponse;

/**
 * @author Eyüp Akay
 */
public interface GreetingService {

    GreetingResponse handshake(GreetingRequest request);
}
