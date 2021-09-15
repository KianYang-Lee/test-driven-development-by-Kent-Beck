package com.example.chap1;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

@Ignore
public class MoneyTest {
    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        Assert.assertEquals(10, five.amount);
    }
}
