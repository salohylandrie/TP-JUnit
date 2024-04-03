package fr.emse.test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class MoneyTest {
    private Money m12CHF;
    private Money mAnother12CHF;
    private Money m14CHF;
    private Money m7USD;

    @Before
    public void setUp() {
        m12CHF = new Money(12, "CHF");
        mAnother12CHF = new Money(12, "CHF");
        m14CHF = new Money(14, "CHF");
        m7USD = new Money(7, "USD");
    }

    @Test
    public void testSimpleAdd() {
        Money expected = new Money(26, "CHF");
        Money result = m12CHF.add(m14CHF);
        assertEquals(expected.amount(), result.amount());
        assertEquals(expected.currency(), result.currency());
    }

    @Test
    public void testEquals() {
        assertEquals(m12CHF, mAnother12CHF);
        assertNotEquals(m12CHF, m14CHF);
        assertNotEquals(m12CHF, m7USD);
    }
}
