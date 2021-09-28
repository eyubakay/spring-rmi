package com.rmi.lib.base.model;

import java.io.Serializable;

/**
 * @author Eyüp Akay
 */
public class BaseResponse implements Serializable {

    private Boolean status;
    private String message;
    private int errorCode;

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }
}
