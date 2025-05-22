package org.andres.design_pattern.factory;

import org.apache.logging.log4j.core.config.plugins.validation.constraints.NotBlank;

public class ComputerFactory {
    public static Computer getComputer(String type, String ram, String hdd, String cpu) {
        if (type.equalsIgnoreCase("pc")) {
            return new PC(ram, hdd, cpu);
        } else if (type.equalsIgnoreCase("server")) {
            return new Server(ram, hdd, cpu);
        } else {
            return null;
        }
    }
}
