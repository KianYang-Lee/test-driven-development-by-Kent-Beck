package com.example.chap2;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

// // INITIAL STATE
//public class MoneyTest {
//    @Test
//    public void testMultiplication() {
//        Dollar five = new Dollar(5);
//        five.times(2);
//        Assert.assertEquals(10, five.amount);
//        five.times(3);
//        Assert.assertEquals(15, five.amount);
//    }
//}

@Ignore
public class MoneyTest {
    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        Assert.assertEquals(10, product.amount);
        product = five.times(3);
        Assert.assertEquals(15, product.amount);
    }
}
