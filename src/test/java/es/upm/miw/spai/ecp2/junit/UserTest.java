package es.upm.miw.spai.ecp2.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.spai.ecp2.junit.User;

public class UserTest {
    private User user;
    
    @Before
    public void before() {
        user = new User(27,"Juanma","Tena");
    }
    
    @Test
    public void testUser(){
        assertEquals(27, user.getNumber());
        assertEquals("Juanma", user.getName());
        assertEquals("Tena", user.getFamilyName());
    }
    
    @Test
    public void testFullName(){
        assertEquals("Juanma Tena", user.fullName());
    }
    
    @Test
    public void testInitials(){
        assertEquals("J.", user.initials());
    }
    
}
