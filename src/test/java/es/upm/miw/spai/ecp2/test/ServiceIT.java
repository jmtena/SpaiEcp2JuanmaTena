package es.upm.miw.spai.ecp2.test;

import static org.junit.Assert.*;

import org.junit.Test;

import es.upm.miw.spai.ecp2.test.Service;

public class ServiceIT {

    @Test
    public void test() {
        Service service = new Service();
        assertNotNull(service.getValue());
    }

}
