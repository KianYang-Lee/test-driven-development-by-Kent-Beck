package com.example.chap8;

public class Franc extends Money {
    public Franc(int amount) {
        this.amount = amount;
    }
    // Reconciling two different implementations of times() by returning Money (superclass) instead
    public Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }
}