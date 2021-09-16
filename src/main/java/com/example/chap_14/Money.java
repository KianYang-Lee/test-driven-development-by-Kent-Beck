package com.example.chap_14;

public class Money implements Expression {
    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    public static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    public String currency() {
        return currency;
    }

    public Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    public Expression plus(Money addend) {
        return new Sum(this, addend);
    }

    // An ugly but dirty quick solution to make the test pass
    // This works but Money should not know about exchange rate, from a design perspective
//    public Money reduce(Bank bank, String to) {
//        int rate = (currency.equals("CHF") && to.equals("USD"))
//                ? 2
//                : 1;
//        return new Money(amount / rate, to);
//    }

    // Money now only needs to ask Bank for the right rate
    public Money reduce(Bank bank, String to) {
        int rate = bank.rate(currency, to);
        return new Money(amount / rate, to);
    }

    @Override
    public String toString() {
        return amount + " " + currency;
    }

    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
                && currency().equals(money.currency());
    }
}
