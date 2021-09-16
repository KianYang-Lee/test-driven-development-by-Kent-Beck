package com.example.chap8;

// Make Money abstract
public abstract class Money {
    protected int amount;

    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
            && getClass().equals(money.getClass());
    }

//    // Factory method implementation to create and return a Dollar
//    public static Dollar dollar(int amount) {
//        return new Dollar(amount);
//    }

    // Declare Money.times() to satisfy compiler
    abstract Money times(int multiplier);

    // Factory method implementation to create and return a Dollar with declaration of Money class
    public static Money dollar(int amount) {
        return new Dollar(amount);
    }

    // Factory method implementation to create and return a Franc
    public static Money franc(int amount) {
        return new Franc(amount);
    }
}
