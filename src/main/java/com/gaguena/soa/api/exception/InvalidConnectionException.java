package com.gaguena.soa.api.exception;

public class InvalidConnectionException extends BaseException{

    private static final long serialVersionUID = 1L;

    public InvalidConnectionException() {
        super();
    }

    public InvalidConnectionException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public InvalidConnectionException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidConnectionException(String message) {
        super(message);
    }

    public InvalidConnectionException(Throwable cause) {
        super(cause);
    }
}
