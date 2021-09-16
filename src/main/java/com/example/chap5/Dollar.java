// ==================================== INITIAL STATE ================================ //
//package com.example.chap5;
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
//    // generalize equality
//    public boolean equals(Object object) {
//        Dollar dollar = (Dollar) object;
//        return amount == dollar.amount;
//    }
//
//}


// =================================== FINAL STATE ================================ //
package com.example.chap5;

public class Dollar {
    private int amount;
    public Dollar(int amount) {
        this.amount = amount;
    }
    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    @Override
    public boolean equals(Object object) {
        Dollar dollar = (Dollar) object;
        return amount == dollar.amount;
    }

}
