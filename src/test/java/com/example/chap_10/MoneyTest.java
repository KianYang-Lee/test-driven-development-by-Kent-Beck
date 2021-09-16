// ====================================== NOTE : INTERESTING TIMES =========================================== //
/*
 * The following were accomplished:
 * - Reconciled two methods - times(), by first inlining the methods they called and then replacing constants
 *      with variables
 * - Wrote a toString() for debugging purpose
 * - Tried a change and let the tests tell us whether it worked
 * - Sometimes we have to back out from an experiment to write another test. Making test works will make the
 *      experiment works.
 */

package com.example.chap_10;

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

    // a Franc(10, "CHF") and a Money(10, "CHF") were reported to be not equal
    // This test is to check that
    @Test
    public void testDifferentClassEquality() {
        Assert.assertTrue(new Money(10, "CHF").equals(new Franc(10, "CHF")));
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