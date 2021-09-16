// ====================================== NOTE : FRANC-LY SPEAKING ================================================== //
/*
 * Test code cycle where each phases has different purpose and calls for different styles of solution:
 * 1. Write a test.
 * 2. Make it compile.
 * 3. Run to see that it fails.
 * 4. Make it run.
 * 5. Remove duplication.
 *
 * We can abandon design principles for step 1 ~ 4, but the design is not complete without step 5, which is
 * incorporating good design principles.
 */

package com.example.chap5;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

//// ========================================= INITIAL STATE ======================================= //

//public class MoneyTest {
//    @Test
//    public void testMultiplication() {
//        Dollar five = new Dollar(5);
//        Assert.assertEquals(new Dollar(10), five.times(2));
//        Assert.assertEquals(new Dollar(15), five.times(3));
//    }
//
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
        Franc five = new Franc(5);
        Assert.assertEquals(new Franc(10), five.times(2));
        Assert.assertEquals(new Franc(15), five.times(3));
    }

    @Test
    public void testEquality() {
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