// ======================================= INITIAL STATE ======================================= //
//package com.example.chap7;
//
//public class Money {
//    protected int amount;
//
//    @Override
//    public boolean equals(Object object) {
//        Money money = (Money) object;
//        return amount == money.amount;
//    }
//}

// ======================================== FINAL STATE ======================================== //
package com.example.chap7;

public class Money {
    protected int amount;

    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        // Comparing the class of two objects: two Moneys are equal only if their amounts and classes are equal
        return amount == money.amount
            && getClass().equals(money.getClass());
    }
}
