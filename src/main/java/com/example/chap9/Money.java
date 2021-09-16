package com.example.chap9;

// Make Money abstract
public abstract class Money {
    protected int amount;
    // push up declaration of variable and implementation of currency() at superclass
    protected String currency;

    // push up implementation of constructor since they are now identical across different subclass
    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public String currency() {
        return  currency;
    }

    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
            && getClass().equals(money.getClass());
    }
    abstract Money times(int multiplier);

    // Move string declaration to static factory methods to enable common implementation
    public static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }
    public static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }
}
