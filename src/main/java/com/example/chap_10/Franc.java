package com.example.chap_10;

public class Franc extends Money {
    public Franc(int amount, String currency) {
        super(amount, currency);
    }

    // inline factory method
    public Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

}