package org.andres.training.design.patterns.decorator.example2;

public class FacebookDecorator extends BaseNotifierDecorator {
    public FacebookDecorator(INotifier wrappedNotifier) {
        super(wrappedNotifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Sending message: " + message + " on Facebook to "
                + databaseService.getFacebookNameFromUsername(getUsername()));
    }
}
