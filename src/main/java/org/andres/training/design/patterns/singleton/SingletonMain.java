package org.andres.training.design.patterns.singleton;

public class SingletonMain {
    public static void main(String[] args) {
        DatabaseConnector databaseConnector = DatabaseConnector.getInstance();
        System.out.println("DatabaseConnector instance: " + databaseConnector);

        DatabaseConnector databaseConnector2 = DatabaseConnector.getInstance();
        System.out.println("DatabaseConnector instance: " + databaseConnector2);

        databaseConnector.connectDatabase();
        databaseConnector2.disconnectDatabase();
        System.out.println();

        databaseConnector.disconnectDatabase();
        databaseConnector2.disconnectDatabase();
    }
}
