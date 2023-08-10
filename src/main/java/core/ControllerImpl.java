package core;

import entities.PasswordGenerator;
import entities.PasswordPasswordGeneratorImpl;

public class ControllerImpl implements Controller {

    private PasswordGenerator passwordGenerator;

    public ControllerImpl() {
        this.passwordGenerator = new PasswordPasswordGeneratorImpl();
    }

    @Override
    public String generatePassword(int passwordLength) {
        return String.format("Generated password: \n%s", this.passwordGenerator.generate(passwordLength));
    }
}
