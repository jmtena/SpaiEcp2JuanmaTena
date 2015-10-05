package es.upm.miw.spai.ecp2.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DecimalCollectionTest {
    private DecimalCollection collection;
    
    @Before
    public void before() {
        collection = new DecimalCollection();
    }
    
    @Test
    public void testDecimalCollection() {
        assertEquals(0, collection.size());
    }
    
}
