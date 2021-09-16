// ====================================== NOTE : EQUALITY FOR ALL, REDUX =========================================== //
/*
 * When we don't have enough tests, we are bound to face refactorings that are not supported by tests.
 * Write the tests that should be there. If not, things will break when we perform refactoring.
 * Retroactively test before refactoring.
 */

package com.example.chap6;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

//// ========================================= INITIAL STATE ======================================= //
//
//public class MoneyTest {
//    @Test
//    public void testMultiplication() {
//        Franc five = new Franc(5);
//        Assert.assertEquals(new Franc(10), five.times(2));
//        Assert.assertEquals(new Franc(15), five.times(3));
//    }
//
//    @Test
//    public void testEquality() {
//        Assert.assertTrue(new Franc(5).equals(new Franc(5)));
//        Assert.assertFalse(new Franc(5).equals(new Franc(6)));
//    }
//
//    @Test
//    public void testFrancMultiplication() {
//        Franc five = new Franc(5);
//        Assert.assertEquals(new Franc(10), five.times(2));
//        Assert.assertEquals(new Franc(15), five.times(3));
//    }
//
//}

// ========================================= FINAL STATE ======================================= //
@Ignore
public class MoneyTest {
    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        Assert.assertEquals(new Dollar(10), five.times(2));
        Assert.assertEquals(new Dollar(15), five.times(3));
    }

    @Test
    public void testEquality() {
        Assert.assertTrue(new Dollar(5).equals(new Dollar(5)));
        Assert.assertFalse(new Dollar(5).equals(new Dollar(6)));
        // Due to copy paste, we did not include quality test for Franc
        // Let's put that in
        Assert.assertTrue(new Franc(5).equals(new Franc(5)));
        Assert.assertFalse(new Franc(5).equals(new Franc(6)));
    }

    @Test
    public void testFrancMultiplication() {
        Franc five = new Franc(5);
        Assert.assertEquals(new Franc(10), five.times(2));
        Assert.assertEquals(new Franc(15), five.times(3));
    }

}