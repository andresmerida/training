package org.andres.training.custom.logging;

import java.text.MessageFormat;
import java.util.ResourceBundle;

public class MyLogger implements System.Logger {

    @Override
    public String getName() {
        return "MyLogger";
    }

    @Override
    public boolean isLoggable(Level level) {
        return true;
    }

    @Override
    public void log(Level level, ResourceBundle bundle, String msg, Throwable thrown) {
        System.out.printf("MyLogger [%s]: %s - %s%n", level, msg, thrown);
    }

    @Override
    public void log(Level level, ResourceBundle bundle, String format, Object... params) {
        System.out.printf("ConsoleLogger [%s]: %s%n", level, MessageFormat.format(format, params));
    }
}
