package com.rmi.orderadapter.api;

import com.rmi.contract.greetingservice.model.GreetingRequest;
import com.rmi.contract.greetingservice.model.GreetingResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Eyüp Akay
 */
@RequestMapping("/greeting")
public interface GreetingApi {

    @GetMapping(value = "/handshake")
    ResponseEntity<GreetingResponse> handshake(@RequestBody GreetingRequest request);
}
