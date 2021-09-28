package com.rmi.contract.calculatorservice.model;


import com.rmi.lib.base.model.BaseResponse;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author Eyüp Akay
 */
public class CalculatorResponse extends BaseResponse implements Serializable {

    private BigDecimal result;

    public CalculatorResponse() {
    }

    public CalculatorResponse(BigDecimal result) {
        this.result = result;
    }

    public BigDecimal getResult() {
        return result;
    }

    public void setResult(BigDecimal result) {
        this.result = result;
    }
}
