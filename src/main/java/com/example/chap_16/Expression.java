package com.example.chap_16;

public interface Expression {
    Money reduce(Bank bank, String to);

    Expression plus(Expression addend);

    // Need to declare times() in Expression for code to compile since it augend and addend were abstracted
    // to Expressions
    Expression times(int multiplier);
}
