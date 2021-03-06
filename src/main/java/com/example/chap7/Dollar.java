//// ==================================== INITIAL STATE ================================ //
//package com.example.chap7;
//
//public class Dollar extends Money {
//    public Dollar(int amount) {
//        this.amount = amount;
//    }
//    public Dollar times(int multiplier) {
//        return new Dollar(amount * multiplier);
//    }
//}

// =================================== FINAL STATE ================================ //
package com.example.chap7;

public class Dollar extends Money {
    public Dollar(int amount) {
        this.amount = amount;
    }
    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
}
