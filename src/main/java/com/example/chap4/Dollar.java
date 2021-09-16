// ====================================== NOTE : PRIVACY ================================================== //
/*
 * By saying everything in both code and tests, TDD aims to reduce the defects enough to move forward with
 * confidence.
 */

//// ==================================== INITIAL STATE ================================ //
//package com.example.chap4;
//
//public class Dollar {
//    public int amount;
//    public Dollar(int amount) {
//        this.amount = amount;
//    }
//    public Dollar times(int multiplier) {
//        return new Dollar(amount * multiplier);
//    }
//
//    // generalize equality
//    public boolean equals(Object object) {
//        Dollar dollar = (Dollar) object;
//        return amount == dollar.amount;
//    }
//
//}

// =================================== FINAL STATE ================================ //
package com.example.chap4;

public class Dollar {
    // Change instance variable "amount" to private as only Dollar class is accessing it
    private int amount;
    public Dollar(int amount) {
        this.amount = amount;
    }
    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    // generalize equality
    public boolean equals(Object object) {
        Dollar dollar = (Dollar) object;
        return amount == dollar.amount;
    }

}
