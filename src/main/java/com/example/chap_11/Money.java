package com.example.chap_11;

public class Money {
    protected int amount;
    protected String currency;

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
                && currency().equals(money.currency());
    }

    public Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    // using dollar() method to return Money class with USD currency instead of using subclass
    public static Money dollar(int amount) {
        return new Money(amount, "USD");
    }
    // using dollar() method to return Money class with CHF currency instead of using subclass
    public static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    @Override
    public String toString() {
        return amount + " " + currency;
    }
}
