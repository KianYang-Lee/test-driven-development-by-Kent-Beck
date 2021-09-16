package com.example.chap_14;

// This is the implementator
public class Sum implements Expression {
    Money augend;
    Money addend;

    // Methods in interfaces have to be public
    public Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }

    public Money reduce(Bank bank, String to) {
        int amount = augend.amount + addend.amount;
        return new Money(amount, to);
    }
}
