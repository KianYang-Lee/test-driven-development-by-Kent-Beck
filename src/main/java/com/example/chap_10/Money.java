package com.example.chap_10;

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

    // Problem with this is we are checking whether the Class are equal, where instead we should check
    // for whether the currencies are equal
//    @Override
//    public boolean equals(Object object) {
//        Money money = (Money) object;
//        return amount == money.amount
//            && getClass().equals(money.getClass());
//    }

    // Checking for currency equality
    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
                && currency().equals(money.currency());
    }

    // inline factory method
    public Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    public static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }
    public static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

    @Override
    public String toString() {
        return amount + " " + currency;
    }
}
