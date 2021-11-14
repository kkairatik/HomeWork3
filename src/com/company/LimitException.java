package com.company;

public class LimitException extends Exception{
    public LimitException(String message, double remainingAmount) {
        super(message);
    }

    public LimitException(String на_вашем_счету_недастаточно_средств) {

    }
}
