package org.andres.design_pattern.singleton;

public class DatabaseConnectionManager {
    private static DatabaseConnectionManager instance;
    private DatabaseConnectionManager() {
        System.out.println("DatabaseConnectionManager is created.");
    }

    public static DatabaseConnectionManager getInstance() {
        if (instance == null) {
            instance = new DatabaseConnectionManager();
        }
        return instance;
    }

    // Additional methods for managing database connection.
    public void connect() {
        System.out.println("Database connection established.");
    }
}
