package com.example.chap_13;

public class Bank {
    // This works but it works because it is data duplication
    Money reduce(Expression source, String to) {
        // This snippet is ugly because:
        // 1. The cast. This code should work with any expression, not just Sum
        // 2. The public fields, and two levels of references at that.
//        Sum sum = (Sum) source;
//        int amount = sum.augend.amount + sum.addend.amount;
//        return new Money(amount, to);

        // Better implementation but still does not handle the case where the Expression is not a Sum
//        Sum sum = (Sum) source;
//        return sum.reduce(to);

        // Cast to Money if Expression is Money
        // Althought this lets the test cases pass, we should use polymorphism instead any time we are checking
        //  classes explicitly
//        if (source instanceof Money)
//            return (Money) source.reduce(to);
//        Sum sum = (Sum) source;
//        return sum.reduce(to);

        // Class casting is removed since it is implemented in Expression interface
        return source.reduce(to);
    }
}
