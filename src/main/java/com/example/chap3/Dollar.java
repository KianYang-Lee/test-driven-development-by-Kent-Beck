// ====================================== NOTE ================================================== //
/*
 * TRIANGULATION - When we triangulate, we only generalize code when we have two examples or more.
 * We briefly ignore duplication between test and model code.
 * It is when the second example demands a more general solution of our code, only then
 * we generalize the code.
 *
 * It gives us another angle at thinking at the problem. Make some of the axes of variability
 * that you are trying to support in your design, and the answer may become clearer.
 */

//// ==================================== Initial state ================================ //
//package com.example.chap3;
//
//public class Dollar {
//    public int amount;
//    public Dollar(int amount) {
//        this.amount = amount;
//    }
//    public Dollar times(int multiplier) {
//        amount *= multiplier;
//        return null;
//    }
//    // force pass
//    public boolean equals(Object object) {
//            return true;
//            }
//
//}

// =================================== FINAL STATE ================================ //
package com.example.chap3;

public class Dollar {
    public int amount;
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
