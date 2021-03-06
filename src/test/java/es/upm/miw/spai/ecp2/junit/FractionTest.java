package es.upm.miw.spai.ecp2.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class FractionTest {
    private Fraction fraction;
    
    @Before
    public void before() {
        fraction = new Fraction(2,3);
    }
    
    @Test
    public void testFractionIntInt() {
        assertEquals(2, fraction.getNumerator());
        assertEquals(3, fraction.getDenominator());
    }
    
    @Test
    public void testFraction() {
        fraction = new Fraction();
        assertEquals(1, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
    }
    
    @Test
    public void testDecimal(){
        assertEquals(0.6666, fraction.decimal(), 10e-5);
    }
    
    @Test
    public void testIsEquivalent(){
    	assertEquals(true, fraction.isEquivalent(new Fraction (4, 6)));
    }
    
    @Test
    public void testCompare(){
    	Fraction minor = new Fraction(1,6);
    	Fraction major = new Fraction(2,3);
    	
    	assertEquals(minor.compare(major), -1, 0.0);
    	assertEquals(major.compare(minor), 1, 0.0);
    	assertEquals(minor.compare(minor), 0, 0.0);
    }
    
    @Test
    public void testMultiply(){
        fraction.multiply(new Fraction (2,3));
        assertEquals(4, fraction.getNumerator());
        assertEquals(9, fraction.getDenominator());
    }
    
    
}
