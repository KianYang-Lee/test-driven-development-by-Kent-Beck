// ====================================== NOTE : ADDITION, FINALLY =========================================== //
/*
 * The following were accomplished:
 * - Reduced a big test to a smaller test that represents progress
 * - Thought carefully about possible metaphors for computation
 * - Rewrote previous test based on new metaphor
 * - Got the test to compile quickly
 * - Made it run
 */

package com.example.chap_12;

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

    // Test for performing addition
    // Expression is handled by another object, which is Bank in this case.
    @Test
    public void testSimpleAddtion() {
        Money five = Money.dollar(5);
        Expression sum = five.plus(five);
        // reduced Expression is created by applying exchange rates to an Expression
        Bank bank = new Bank();
        Money reduced = bank.reduce(sum, "USD");
        Assert.assertEquals(Money.dollar(10), reduced);
    }
}