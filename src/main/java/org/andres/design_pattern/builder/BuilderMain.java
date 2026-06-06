package org.andres.design_pattern.builder;

public class BuilderMain {
    static void main() {
        User user = new User.Builder()
                .setFirstName("Andrew")
                .setLastName("Merida")
                .setAge(25)
                .build();

        IO.println(user.toString());
    }
}
