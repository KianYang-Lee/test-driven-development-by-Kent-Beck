package com.example.chap6;

public class Money {
    // Move "amount" instance variable and change visibility from private to protected so that subclass can still
    // see it
    protected int amount;

    // Moved equals method from subclass Dollar to superclass
    @Override
    public boolean equals(Object object) {
        // Change declaration of temporary variable and naming
        Money money = (Money) object;
        return amount == money.amount;
    }
}
