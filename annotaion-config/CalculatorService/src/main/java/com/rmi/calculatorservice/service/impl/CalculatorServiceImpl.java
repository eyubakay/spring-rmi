package com.rmi.calculatorservice.service.impl;

import com.google.gson.Gson;
import com.rmi.contract.calculatorservice.model.CalculatorRequest;
import com.rmi.contract.calculatorservice.model.CalculatorResponse;
import com.rmi.contract.calculatorservice.service.CalculatorService;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;


/**
 * @author Eyüp Akay
 */
public class CalculatorServiceImpl implements CalculatorService {

    private Logger logger = Logger.getLogger(this.getClass().getName());
    @Autowired
    private Gson gson;

    @Override
    public CalculatorResponse calculate(CalculatorRequest request) {
        logger.info("CalculateServiceImpl::calculate" + gson.toJson(request));

        CalculatorResponse response = new CalculatorResponse();
        if (Objects.isNull(request.getOperationType())
                || Objects.isNull(request.getNumber1())
                || Objects.isNull(request.getNumber2())) {
            response.setStatus(false);
            response.setMessage("FAIL, invalid inputs");
        }
        switch (request.getOperationType()) {
            case ADDITION:
                response.setResult(request.getNumber1().add(request.getNumber2()));
                break;
            case MULTIPLICATION:
                response.setResult(request.getNumber1().multiply(request.getNumber2()));
                break;
            case DIVISION:
                response.setResult(request.getNumber1().divide(request.getNumber2()));
                break;
            case SUBTRACTION:
                response.setResult(request.getNumber1().subtract(request.getNumber2()));
                break;
        }
        response.setStatus(true);
        response.setMessage("SUCCESS");
        return response;
    }

    public void setGson(Gson gson) {
        this.gson = gson;
    }

}
