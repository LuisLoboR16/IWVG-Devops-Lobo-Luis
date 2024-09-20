//Enhanced fraction test
package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FractionTest {

    @Test
    void testIsProper() {
        Fraction fraction = new Fraction(1, 2);
        assertTrue(fraction.isProper());

        fraction = new Fraction(3, 2);
        assertFalse(fraction.isProper());
    }

    @Test
    void testIsImproper() {
        Fraction fraction = new Fraction(3, 2);
        assertTrue(fraction.isImproper());

        fraction = new Fraction(1, 2);
        assertFalse(fraction.isImproper());
    }

    @Test
    void testIsEquivalent() {
        Fraction fraction1 = new Fraction(2, 4);
        Fraction fraction2 = new Fraction(1, 2);
        assertTrue(fraction1.isEquivalent(fraction2));

        fraction2 = new Fraction(3, 4);
        assertFalse(fraction1.isEquivalent(fraction2));
    }

    @Test
    void testAdd() {
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(1, 3);
        Fraction result = fraction1.add(fraction2);

        assertEquals(5, result.getNumerator());
        assertEquals(6, result.getDenominator());
    }

    @Test
    void testMultiply() {
        Fraction fraction1 = new Fraction(2, 3);
        Fraction fraction2 = new Fraction(3, 4);
        Fraction result = fraction1.multiply(fraction2);

        assertEquals(6, result.getNumerator());
        assertEquals(12, result.getDenominator());
    }

    @Test
    void testDivide() {
        Fraction fraction1 = new Fraction(2, 3);
        Fraction fraction2 = new Fraction(3, 4);
        Fraction result = fraction1.divide(fraction2);

        assertEquals(8, result.getNumerator());
        assertEquals(9, result.getDenominator());
    }
}