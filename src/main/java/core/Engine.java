package core;

import java.util.Scanner;

public class Engine implements Runnable {

    private Controller controller;
    private Scanner scanner;

    public Engine() {
        this.controller = new ControllerImpl();
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void run() {

        System.out.println("Welcome to password generator.\nIn order to generate a password, simply type Y in the console and the desired length of the password.\nOtherwise type in N.");

        String input = scanner.nextLine();

        while(!input.equals("N")) {

            String output = null;

            try {
                    output = this.controller.generatePassword(Integer.parseInt(input.split(" ")[1]));

            } catch (Exception e) {

                output = e.getMessage();

            }

            System.out.println(output);

            System.out.println("Generate new password? [Y/N]");

            input = scanner.nextLine();
        }

    }
}
