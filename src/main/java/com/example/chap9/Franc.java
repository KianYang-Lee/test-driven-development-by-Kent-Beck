package com.example.chap9;

public class Franc extends Money {
    public Franc(int amount, String currency) {
        super(amount, currency);
    }

    // Convert Franc.times() to call factory method instead of constructor
    public Money times(int multiplier) {
        return Money.franc(amount * multiplier);
    }

}