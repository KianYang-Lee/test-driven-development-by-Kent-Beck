//// ==================================== INITIAL STATE ================================ //
//package com.example.chap6;
//
//public class Dollar {
//    private int amount;
//    public Dollar(int amount) {
//        this.amount = amount;
//    }
//    public Dollar times(int multiplier) {
//        return new Dollar(amount * multiplier);
//    }
//
//    @Override
//    public boolean equals(Object object) {
//        Dollar dollar = (Dollar) object;
//        return amount == dollar.amount;
//    }
//
//}

// =================================== FINAL STATE ================================ //
package com.example.chap6;

// Have a common superclass which is Money
public class Dollar extends Money {
    public Dollar(int amount) {
        this.amount = amount;
    }
    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }



}
