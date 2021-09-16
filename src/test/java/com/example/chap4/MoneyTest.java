package com.example.chap4;

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
//}

// ========================================= FINAL STATE ======================================= //
@Ignore
public class MoneyTest {
    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        // Compare Dollar to Dollar (object to object)
        // Inline product variable
        // Now the test speaks more clearly as if it is an assertion of truth, not a sequence of operations
        Assert.assertEquals(new Dollar(10), five.times(2));
        Assert.assertEquals(new Dollar(15), five.times(3));
    }

    @Test
    public void testEquality() {
        Assert.assertTrue(new Dollar(5).equals(new Dollar(5)));
        Assert.assertFalse(new Dollar(5).equals(new Dollar(6)));
    }

}