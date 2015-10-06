package es.upm.miw.spai.ecp2.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DecimalCollectionTest {
    private DecimalCollection collection;
    
    @Before
    public void before() {
        collection = new DecimalCollection();
        collection.add(1.95);
        collection.add(9.75);
    }
    
    @Test
    public void testSize() {
        assertEquals(2, collection.size());
    }
    
    @Test
    public void testSum() {
        assertEquals(11.70, collection.sum(), 10e-5);
    }
    
    @Test
    public void testHigher(){
        assertEquals(9.75, collection.higher(), 10e-5);
    }
    
    @Test
    public void testAmplitud(){
    	assertEquals(7.8, collection.amplitud(), 10e-5);
    }
}
