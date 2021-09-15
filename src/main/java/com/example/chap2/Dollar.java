// ====================================== NOTE ================================================== //
/*
 * The general TDD cycle goes as follow:
 * 1. Write a test. Invent the interface you wish you had.
 * 2. Make it run. Change the bar from red to green with the fastest mean possible,
 * even though it involves cutting edges.
 * 3. Make it right. Get to green by focusing on the right software engineering principles.
 *
 * Strategies to quickly get to green:
 * - Fake it - return a constant and gradually replace constants with variables
 * - Use Obvious Implementation - Type in the real implementation
 * - Triangulation
 */

// ==================================== Initial state ================================ //
//package com.example.chap2;
//
//public class Dollar {
//
//    // instance variable
//    public int amount;
//
//    // constructor
//    public Dollar(int amount) {
//        this.amount = amount;
//    }
//
//    // instance method
//    public void times(int multiplier) {
//        amount *= multiplier;
//    }
//}

// =================================== FINAL STATE ================================ //
package com.example.chap2;

public class Dollar {
    public int amount;
    public Dollar(int amount) {
        this.amount = amount;
    }
    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

}