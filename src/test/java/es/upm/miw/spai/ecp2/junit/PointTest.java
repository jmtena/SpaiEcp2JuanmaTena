package es.upm.miw.spai.ecp2.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PointTest {
    private Point pt;

    @Before
    public void before() {
        pt = new Point(2, 3);
    }

    @Test
    public void testPuntoIntInt() {
        assertEquals(2, pt.getX());
        assertEquals(3, pt.getY());
    }

    @Test
    public void testPunto() {
        pt = new Point();
        assertEquals(0, pt.getX());
        assertEquals(0, pt.getY());
    }

    @Test
    public void testModulo() {
        assertEquals(3.6055, pt.module(), 10e-5);
    }

    @Test
    public void testFase() {
        assertEquals(0.9828, pt.phase(), 10e-5);
    }

    @Test
    public void testTranslate() {
        this.pt.translateOrigin(new Point(1, 1));
        assertEquals(1, pt.getX());
        assertEquals(2, pt.getY());
    }
    
    @Test
    public void testIsEqual(){
    	assertEquals(true, pt.isEqual(new Point (2,3)));
    }
    
    @Test
    public void testSetX(){
    	Point point = new Point();
    	point.setX(10);
    	
    	assertEquals(point.getX(), 10, 0.0);
    }
    
    @Test
    public void testSetY(){
    	Point point = new Point();
    	point.setY(10);
    	
    	assertEquals(point.getY(), 10, 0.0);
    }
    
    @Test
    public void testSetXY(){
    	Point point = new Point();
    	point.setXY(5,7);
    	
    	assertEquals(point.getX(), 5, 0.0);
    	assertEquals(point.getY(), 7, 0.0);
    }

}
