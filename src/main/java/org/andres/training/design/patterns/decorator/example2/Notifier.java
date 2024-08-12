package org.andres.training.design.patterns.decorator.example2;

public class Notifier implements INotifier {
    private final String username;
    private final DatabaseService databaseService;

    public Notifier(String username) {
        this.username = username;
        this.databaseService = new DatabaseService();
    }

    @Override
    public void send(String message) {
        System.out.println("Sending " + message + " by Mail to "
                + databaseService.getMailFromUsername(username));
    }

    @Override
    public String getUsername() {
        return username;
    }
}
