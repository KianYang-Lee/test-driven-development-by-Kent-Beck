package com.example.chap_15;

public class Sum implements Expression {
    // Converting Money to Expression
    Expression augend;
    Expression addend;

    // Converting Money to Expression
    public Sum(Expression augend, Expression addend) {
        this.augend = augend;
        this.addend = addend;
    }

    // Reduce both arguments
    public Money reduce(Bank bank, String to) {
        int amount = augend.reduce(bank, to).amount + addend.reduce(bank, to).amount;
        return new Money(amount, to);
    }

    // Stub out implementation of plus() in Sum
    public Expression plus(Expression added) {
        return null;
    }
}
