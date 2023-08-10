package entities;

import java.util.Random;

public class PasswordPasswordGeneratorImpl implements PasswordGenerator {
    private String generatedPassword;
    private Random random;

    public PasswordPasswordGeneratorImpl() {

        this.generatedPassword = null;
        this.random = new Random();

    }

    @Override
    public String generate(int passwordLength) {

        if (passwordLength <= 0) {
            throw new IllegalArgumentException("Password length should be a positive number.");
        }

        StringBuilder password = new StringBuilder();

        for (int i = 0; i < passwordLength; i++) {

            int generatedIndex = this.random.nextInt(33, 127);
            char character = (char) generatedIndex;

            password.append(character);

        }

        return password.toString();
    }
}
