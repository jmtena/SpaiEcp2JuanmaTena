package es.upm.miw.spai.ecp2.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.spai.ecp2.test.Natural;

public class NaturalTest {

    private Natural myClass;

    @Before
    public void before() {
        myClass = new Natural(5);
    }

    @Test
    public void testNatural() {
        assertEquals(5, myClass.getValue());
    }

    @Test
    public void testDuplex() {
        assertEquals(10, myClass.duplex());
    }

}
