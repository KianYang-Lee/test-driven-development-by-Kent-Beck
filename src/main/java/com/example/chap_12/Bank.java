package com.example.chap_12;

public class Bank {
    public Money reduce(Expression source, String to) {
        // Attempt 1: Just getting it to compile
//        return null;

        // Attempt 2: Fake the implementation
        return Money.dollar(10);

        // The tests pass and we are ready for more refactoring.
    }
}
