package com.rmi.orderadapter.controller;

import com.google.gson.Gson;
import com.rmi.contract.calculatorservice.model.CalculationOperationType;
import com.rmi.contract.calculatorservice.model.CalculatorRequest;
import com.rmi.contract.calculatorservice.model.CalculatorResponse;
import com.rmi.contract.calculatorservice.service.CalculatorService;
import com.rmi.orderadapter.api.CalculatorApi;
import com.rmi.orderadapter.model.CalculateOrder;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Eyüp Akay
 */
@RestController
public class CalculatorApiController implements CalculatorApi {

    private Logger logger = Logger.getLogger(this.getClass().getName());
    @Autowired
    private CalculatorService calculatorService;
    @Autowired
    private Gson gson;

    @Override
    public ResponseEntity<CalculatorResponse> calculate(CalculateOrder request) {
        logger.info(gson.toJson(request));
        return new ResponseEntity<>(calculatorService.calculate(getCalculatorRequest(request)), HttpStatus.OK);
    }

    private CalculatorRequest getCalculatorRequest(CalculateOrder request) {
        CalculatorRequest request1 = new CalculatorRequest();
        request1.setNumber1(request.getNumber1());
        request1.setNumber2(request.getNumber2());
        request1.setOperationType(CalculationOperationType.findByOperator(request.getOperationType()));
        return request1;
    }

    public void setCalculatorService(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    public void setGson(Gson gson) {
        this.gson = gson;
    }
}
