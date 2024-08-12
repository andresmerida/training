package org.andres.training.design.patterns.decorator.example2;

public class WhatsappDecorator extends BaseNotifierDecorator {
    WhatsappDecorator(INotifier wrappedNotifier) {
        super(wrappedNotifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        String phoneNumber = databaseService.getPhoneNumberFromUsername(getUsername());
        System.out.println("Sending " + message + " by Whatsapp on " + phoneNumber);
    }
}
