package org.andres.training.design.patterns.singleton;

public class DatabaseConnector {
    // convert to volatile to ensure thead safe
    private static volatile DatabaseConnector instance = null;

    private DatabaseConnector() {
        System.out.println("DatabaseConnector singleton instance");
    }

    public static DatabaseConnector getInstance() {
        if (instance == null) {
            // to make thread safe
            synchronized (DatabaseConnector.class) {
                // check again as multiple threads
                // can reach above step
                if (instance == null) {
                    instance = new DatabaseConnector();
                }
            }
        }

        return instance;
    }

    public void connectDatabase() {
        if (instance == null) {
            throw new NullPointerException("DatabaseConnector instance is null");
        }
        System.out.println("DatabaseConnector connected to database");
    }

    public void disconnectDatabase() {
        if (instance == null) {
            throw new NullPointerException("DatabaseConnector instance is null");
        }
        System.out.println("Disconnecting database connection");
    }
}
