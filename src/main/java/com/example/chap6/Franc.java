//// =============================== INITIAL STATE ========================================== //
//package com.example.chap6;
//
//public class Franc {
//    private int amount;
//    public Franc(int amount) {
//        this.amount = amount;
//    }
//    public Franc times(int multiplier) {
//        return new Franc(amount * multiplier);
//    }
//
//    @Override
//    public boolean equals(Object object) {
//        Franc franc = (Franc) object;
//        return amount == franc.amount;
//    }
//
//}

// =============================== FINAL STATE ========================================== //
package com.example.chap6;

public class Franc extends Money {
    public Franc(int amount) {
        this.amount = amount;
    }
    public Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    // equals method is moved to superclass
}