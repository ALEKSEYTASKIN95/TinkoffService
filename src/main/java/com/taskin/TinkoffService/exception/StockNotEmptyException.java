package com.taskin.TinkoffService.exception;

public class StockNotEmptyException extends RuntimeException {
    public StockNotEmptyException(String message) {
        super(message);
    }
}
