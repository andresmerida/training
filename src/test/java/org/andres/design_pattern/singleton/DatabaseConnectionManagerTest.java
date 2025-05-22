package org.andres.design_pattern.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseConnectionManagerTest {

    /**
     * Test to verify that the getInstance() method returns a non-null instance of DatabaseConnectionManager.
     */
    @Test
    void testGetInstanceNotNull() {
        DatabaseConnectionManager instance = DatabaseConnectionManager.getInstance();
        assertNotNull(instance, "getInstance() should not return null");
    }

    /**
     * Test to verify that the getInstance() method always returns the same instance (singleton behavior).
     */
    @Test
    void testGetInstanceReturnsSameInstance() {
        DatabaseConnectionManager instance1 = DatabaseConnectionManager.getInstance();
        DatabaseConnectionManager instance2 = DatabaseConnectionManager.getInstance();
        assertSame(instance1, instance2, "getInstance() should always return the same instance");
    }

    /**
     * Test to verify that the connect method of the DatabaseConnectionManager instance is accessible.
     */
    @Test
    void testConnectMethod() {
        DatabaseConnectionManager instance = DatabaseConnectionManager.getInstance();
        assertDoesNotThrow(instance::connect, "connect() method should not throw an exception");
    }
}