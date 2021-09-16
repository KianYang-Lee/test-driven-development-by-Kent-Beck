// ====================================== NOTE : TIMES WE'RE LIVIN' IN =========================================== //
/*
 * Only entertain a brief interruption, but only a brief one, and never interrupt an interruption.
 *
 * TDD is a steering process. There is no right step size on the changes to your code and tests, now and forever.
 *
 * The following were accomplished:
 * - Reconciled the two constructors by moving the variation to the caller (the factory method)
 * - Repeated an analogous refactoring in one big step
 * - Pushed up identical constructors
 */

package com.example.chap9;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

@Ignore
public class MoneyTest {
    @Test
    public void testMultiplication() {
        Money five = Money.dollar(5);
        Assert.assertEquals(Money.dollar(10), five.times(2));
        Assert.assertEquals(Money.dollar(15), five.times(3));
    }

    @Test
    public void testEquality() {
        Assert.assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        Assert.assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        Assert.assertTrue(Money.franc(5).equals(Money.franc(5)));
        Assert.assertFalse(Money.franc(5).equals(Money.franc(6)));
        Assert.assertFalse(Money.franc(5).equals(Money.dollar(5)));
    }

    @Test
    public void testFrancMultiplication() {
        Money five = Money.franc(5);
        Assert.assertEquals(Money.franc(10), five.times(2));
        Assert.assertEquals(Money.franc(15), five.times(3));
    }

    @Test
    public void testCurrency() {
        Assert.assertEquals("USD", Money.dollar(1).currency());
        Assert.assertEquals("CHF", Money.franc(1).currency());
    }
}