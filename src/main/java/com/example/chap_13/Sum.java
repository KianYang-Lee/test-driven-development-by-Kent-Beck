package com.example.chap_13;

// Sum also needs to be a kind of Expression
public class Sum implements  Expression{
    Money augend;
    Money addend;

    // Constructor to make code compile
    public Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }

    public Money reduce(String to) {
        int amount = augend.amount + addend.amount;
        return new Money(amount, to);
    }
}
