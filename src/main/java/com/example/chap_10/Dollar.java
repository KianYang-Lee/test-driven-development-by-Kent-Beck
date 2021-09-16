package com.example.chap_10;

public class Dollar extends Money {
    public Dollar(int amount, String currency) {
        super(amount, currency);
    }
    // inline Factory method
    public Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

}
