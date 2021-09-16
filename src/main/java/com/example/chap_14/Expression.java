package com.example.chap_14;

// This is the implementor
public interface Expression {
    Money reduce(Bank bank, String to);
}
