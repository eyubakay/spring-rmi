package com.rmi.orderadapter.api;

import com.rmi.contract.calculatorservice.model.CalculatorResponse;
import com.rmi.orderadapter.model.CalculateOrder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Eyüp Akay
 */
@RequestMapping("/calculator")
public interface CalculatorApi {

    @GetMapping(value = "/calculate")
    ResponseEntity<CalculatorResponse> calculate(@RequestBody CalculateOrder request);

}
