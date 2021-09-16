package com.example.chap_14;


import java.util.Hashtable;

// This is the caller
public class Bank {
    Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

    // Leaving the responsibility of rate conversion to Bank
//    int rate(String from, String to) {
//        return (from.equals("CHF") && to.equals("USD"))
//                ? 2
//                : 1;
//    }

    // To store the rates
    private Hashtable rates = new Hashtable();

    // set the rate when told
    void addRate(String from, String to, int rate) {
        rates.put(new Pair(from, to), new Integer(rate));
    }

    // Look up the rate when asked (in a dynamic manner)
//    int rate(String from, String to) {
//        Integer rate = (Integer) rates.get(new Pair(from, to));
//        return rate.intValue();
//    }

    // Check for identical rate and return 1 if so
    int rate(String from, String to) {
        if (from.equals(to)) return 1;
        Integer rate = (Integer) rates.get(new Pair(from, to));
        return rate.intValue();
    }
}
