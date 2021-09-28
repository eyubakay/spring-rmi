package com.rmi.contract.calculatorservice.service;

import com.rmi.contract.calculatorservice.model.CalculatorRequest;
import com.rmi.contract.calculatorservice.model.CalculatorResponse;

/**
 * @author Eyüp Akay
 */
public interface CalculatorService {

    CalculatorResponse calculate(CalculatorRequest request);
}
