package org.noob2ee.padavan.creational.singleton;

import org.junit.Test;
import org.noob2ee.padavan.level4.creational.singleton.DoubleCheckedSingleton;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DoubleCheckedSingletonTest {

    @Test
    public void okNewInstance() {
        DoubleCheckedSingleton newInstance = DoubleCheckedSingleton.getInstance();
        assertNotNull(newInstance);
        DoubleCheckedSingleton newInstance2 = DoubleCheckedSingleton.getInstance();
        assertNotNull(newInstance2);
        assertEquals(newInstance, newInstance2);
    }

}