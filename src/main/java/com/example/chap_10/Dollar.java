package com.example.chap_10;

public class Dollar extends Money {
    public Dollar(int amount, String currency) {
        super(amount, currency);
    }
    // times() method pushed up since they are identical
}
