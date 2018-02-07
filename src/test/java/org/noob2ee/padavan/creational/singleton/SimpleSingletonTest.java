package org.noob2ee.padavan.creational.singleton;

import org.junit.Test;
import org.noob2ee.padavan.level4.creational.singleton.SimpleSingleton;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SimpleSingletonTest {


    @Test
    public void okNewInstance() {
        SimpleSingleton newInstance = SimpleSingleton.getInstance();
        assertNotNull(newInstance);
        SimpleSingleton newInstance2 = SimpleSingleton.getInstance();
        assertNotNull(newInstance2);
        assertEquals(newInstance, newInstance2);
    }
}