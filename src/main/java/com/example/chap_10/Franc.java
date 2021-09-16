package com.example.chap_10;

public class Franc extends Money {
    public Franc(int amount, String currency) {
        super(amount, currency);
    }

    // times() method pushed up to superclass
}