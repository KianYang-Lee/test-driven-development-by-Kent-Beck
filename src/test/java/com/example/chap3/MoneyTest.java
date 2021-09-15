package com.example.chap3;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

//// ========================================= INITIAL STATE ======================================= //
//
//public class MoneyTest {
//    @Test
//    public void testMultiplication() {
//        Dollar five = new Dollar(5);
//        Dollar product = five.times(2);
//        Assert.assertEquals(10, product);
//        Dollar product2 = five.times(3);
//        Assert.assertEquals(15, product2);
//    }
//
//    // IDEAL
//    @Test
//    public void testEquality() {
//        Assert.assertTrue(new Dollar(5).equals(new Dollar(5)));
//        Assert.assertFalse(new Dollar(5).equals(new Dollar(6)));
//    }
//
//    // FORCE PASS
//    @Override
//    public boolean equals(Object obj) {
//        return true;
//    }
//}

// ========================================= FINAL STATE ======================================= //

public class MoneyTest {
    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        Assert.assertEquals(10, product.amount);
        product = five.times(3);
        Assert.assertEquals(15, product.amount);
    }

    // IDEAL
    @Test
    public void testEquality() {
        Assert.assertTrue(new Dollar(5).equals(new Dollar(5)));
        Assert.assertFalse(new Dollar(5).equals(new Dollar(6)));
    }

}