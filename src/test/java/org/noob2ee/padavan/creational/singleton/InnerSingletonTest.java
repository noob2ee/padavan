package org.noob2ee.padavan.creational.singleton;

import org.junit.Test;
import org.noob2ee.padavan.level4.creational.singleton.InnerSingleton;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class InnerSingletonTest {

    @Test
    public void okNewInstance() {
        InnerSingleton instance = InnerSingleton.getInstance();
        assertNotNull(instance);
        InnerSingleton instance2 = InnerSingleton.getInstance();
        assertNotNull(instance2);
        assertEquals(instance, instance2);
    }
}