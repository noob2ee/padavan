package org.noob2ee.padavan.ratio;

import org.junit.Test;
import org.noob2ee.padavan.level0.ratio.Fraction;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class FractionTest {

    @Test
    public void okGcd() {
        assertEquals(2, Fraction.gcd(10, 2));
        assertEquals(2, Fraction.gcd(2, 10));
        assertEquals(10, Fraction.gcd(10, 10));
        assertEquals(2, Fraction.gcd(-10, 2));
        assertEquals(2, Fraction.gcd(10, -2));
        assertEquals(2, Fraction.gcd(-10, -2));
        assertEquals(1, Fraction.gcd(1, 1));
        assertEquals(0, Fraction.gcd(0, 0));
        assertEquals(1, Fraction.gcd(3, 7));
        assertEquals(1, Fraction.gcd(7, 3));
    }

    @Test
    public void okPlus() {
        Fraction f1 = new Fraction(1, 3);
        Fraction f2 = new Fraction(1, 3);
        Fraction res = f1.plus(f2);
        assertNotNull(res);
        assertEquals(2, res.getNumerator());
        assertEquals(3, res.getDenominator());


        f1 = new Fraction(-1, 3);
        f2 = new Fraction(2, 3);
        res = f1.plus(f2);
        assertNotNull(res);
        assertEquals(1, res.getNumerator());
        assertEquals(3, res.getDenominator());

        f1 = new Fraction(1, 3);
        f2 = new Fraction(-2, 3);
        res = f1.plus(f2);
        assertNotNull(res);
        assertEquals(-1, res.getNumerator());
        assertEquals(3, res.getDenominator());
    }
}