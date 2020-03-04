package com.company;

public class LimitException extends Exception {
    String message;
    double remainingAmount;

    public LimitException(String message, double remainingAmount) {
        this.message = message;
        this.remainingAmount = remainingAmount;
    }

    private void getRemainingAmount(){

    }

    /*@Override
    public String getMessage() {
        return super.getMessage();
    }*/
}
