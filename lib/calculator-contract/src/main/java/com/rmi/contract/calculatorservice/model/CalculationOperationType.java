package com.rmi.contract.calculatorservice.model;

/**
 * @author Eyüp Akay
 */
public enum CalculationOperationType {

    ADDITION("+"),
    SUBTRACTION("-"),
    MULTIPLICATION("*"),
    DIVISION("/");

    private String operator;

    CalculationOperationType(String operator) {
        this.operator = operator;
    }

    public static CalculationOperationType findByOperator(String operator){
        for(CalculationOperationType v : values()){
            if( v.getOperator().equals(operator)){
                return v;
            }
        }
        throw new IllegalArgumentException("Unsupported Calculation Operator Type");
    }

    public String getOperator() {
        return operator;
    }
}
