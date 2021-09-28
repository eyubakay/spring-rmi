package com.rmi.orderadapter.model;

import java.math.BigDecimal;

/**
 * @author Eyüp Akay
 */
public class CalculateOrder {

    private BigDecimal number1;
    private BigDecimal number2;
    private String operationType;

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

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }
}
