// ====================================== NOTE : MAKIN' OBJECTS =========================================== //
/*
 * We are one step closer to eliminate subclasses by having fewer references to the subclasses directly
 *
 * Acoomplished the following:
 * - Took a step of eliminating duplication by reconciling the signatures of two variants of the same method -- times()
 * - Moved at least a declaration of method to common superclass
 * - Decoupled test code from existence of concrete subclasses by introducing factory methods
 * - Noticed that when subclass disappear, some test cases are now redundant
 */

package com.example.chap8;

import org.junit.Assert;
import org.junit.Test;

public class MoneyTest {
    @Test
    public void testMultiplication() {
        // Instead of referencing to the subclass directly, refer to the superclass instead
        // Also changing the class declaration type altogether
        // Let's use factory method everywhere in the tests
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

}