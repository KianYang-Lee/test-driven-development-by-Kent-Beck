package com.example.chap_13;

public interface Expression {
    // By adding reduce(String) here, we can eliminate all ugly casts and class checks
    Money reduce(String to);
}
