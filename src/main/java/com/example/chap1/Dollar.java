package com.example.chap1;

//// ======================================= initial state at beginning of chapter
//public class Dollar {
//    public Dollar(int amount) {
//
//    }
//    public void times(int multiplier){
//    }
//    int amount;
//}

// ======================================== final state at end of chapter
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
