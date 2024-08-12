package org.andres.training.design.patterns.decorator.example2;

public class BaseNotifierDecorator implements INotifier {
    private final INotifier wrappedNotifier;
    protected final DatabaseService databaseService;

    BaseNotifierDecorator(INotifier wrappedNotifier) {
        this.wrappedNotifier = wrappedNotifier;
        databaseService = new DatabaseService();
    }

    @Override
    public void send(String message) {
        wrappedNotifier.send(message);
    }

    @Override
    public String getUsername() {
        return wrappedNotifier.getUsername();
    }
}
