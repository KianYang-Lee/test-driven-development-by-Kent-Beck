package com.example.chap1;

// ================================== NOTES =========================================== //
/*
 * Cycle of TDD :
 * 1. Add a little test
 * 2. Run all tests and fail.
 * 3. Make a little changes.
 * 4. Run the tests and succeed.
 * 5. Refactor to remove duplication.
 */

//// ======================================= initial state at beginning of chapter =========================== //
//public class Dollar {
//    public Dollar(int amount) {
//
//    }
//    public void times(int multiplier){
//    }
//    int amount;
//}

// ======================================== final state at end of chapter =================================== //
public class Dollar {

    // instance variable
    public int amount;

    // constructor
    public Dollar(int amount) {
        this.amount = amount;
    }

    // instance method
    public void times(int multiplier) {
        amount *= multiplier;
    }
}
