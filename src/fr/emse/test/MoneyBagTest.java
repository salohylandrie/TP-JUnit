package fr.emse.test;

import static org.junit.Assert.*;
import org.junit.Test;

public class MoneyBagTest {

    @Test
    public void testBagEquals() {
        Money m12CHF = new Money(12, "CHF");
        Money m7USD = new Money(7, "USD");
        MoneyBag bag1 = new MoneyBag(new Money[] { m12CHF, m7USD });
        MoneyBag bag2 = new MoneyBag(new Money[] { m12CHF, m7USD });
        MoneyBag bag3 = new MoneyBag(new Money[] { m12CHF });

        assertTrue(bag1.equals(bag2));
        assertFalse(bag1.equals(bag3));
    }

    @Test
    public void testBagAdd() {
        Money m12CHF = new Money(12, "CHF");
        Money m7USD = new Money(7, "USD");
        MoneyBag bag = new MoneyBag(m12CHF, m7USD);
        Money m14CHF = new Money(14, "CHF");
        MoneyBag expected = new MoneyBag(new Money[] { m12CHF, m7USD, m14CHF });

        assertEquals(expected, bag.add(m14CHF));
    }
}
