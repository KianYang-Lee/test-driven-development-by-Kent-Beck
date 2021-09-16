package com.example.chap8;

public class Dollar extends Money {
    public Dollar(int amount) {
        this.amount = amount;
    }
    // Reconciling two different implementations of times() by returning Money (superclass) instead
    public Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
}
