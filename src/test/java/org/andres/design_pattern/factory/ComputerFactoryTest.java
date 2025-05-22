package org.andres.design_pattern.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputerFactoryTest {

    /**
     * Tests for the `getComputer` method in the `ComputerFactory` class.
     * The method is responsible for creating specific types of Computer instances (PC or Server)
     * based on the provided type parameter.
     */

    @Test
    void testGetComputerWithPCType() {
        // Arrange
        String type = "PC";
        String ram = "16GB";
        String hdd = "1TB";
        String cpu = "3.6GHz";

        // Act
        Computer computer = ComputerFactory.getComputer(type, ram, hdd, cpu);

        // Assert
        assertNotNull(computer);
        assertInstanceOf(PC.class, computer);
        assertEquals(ram, computer.getRAM());
        assertEquals(hdd, computer.getHDD());
        assertEquals(cpu, computer.getCPU());
    }

    @Test
    void testGetComputerWithServerType() {
        // Arrange
        String type = "Server";
        String ram = "32GB";
        String hdd = "2TB";
        String cpu = "2.9GHz";

        // Act
        Computer computer = ComputerFactory.getComputer(type, ram, hdd, cpu);

        // Assert
        assertNotNull(computer);
        assertInstanceOf(Server.class, computer);
        assertEquals(ram, computer.getRAM());
        assertEquals(hdd, computer.getHDD());
        assertEquals(cpu, computer.getCPU());
    }

    @Test
    void testGetComputerWithInvalidType() {
        // Arrange
        String type = "Laptop";
        String ram = "8GB";
        String hdd = "500GB";
        String cpu = "2.5GHz";

        // Act
        Computer computer = ComputerFactory.getComputer(type, ram, hdd, cpu);

        // Assert
        assertNull(computer, "Computer should be null for invalid type");
    }
}