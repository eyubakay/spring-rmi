package com.rmi.contract.calculatorservice.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author Eyüp Akay
 */
public class CalculatorRequest implements Serializable {

    private BigDecimal number1;
    private BigDecimal number2;
    private CalculationOperationType operationType;

    public CalculatorRequest() {
    }

    public CalculatorRequest(BigDecimal number1, BigDecimal number2, CalculationOperationType operationType) {
        this.number1 = number1;
        this.number2 = number2;
        this.operationType = operationType;
    }

    public BigDecimal getNumber1() {
        return number1;
    }

    public void setNumber1(BigDecimal number1) {
        this.number1 = number1;
    }

    public BigDecimal getNumber2() {
        return number2;
    }

    public void setNumber2(BigDecimal number2) {
        this.number2 = number2;
    }

    public CalculationOperationType getOperationType() {
        return operationType;
    }

    public void setOperationType(CalculationOperationType operationType) {
        this.operationType = operationType;
    }
}
