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

        String input = scanner.nextLine();

        while(!input.equals("end")) {

            String output = null;

            try {

                if (input.split(" ")[0].equals("generatePassword")) {

                    output = this.controller.generatePassword(Integer.parseInt(input.split(" ")[1]));

                } else {

                    throw new IllegalArgumentException("Invalid command.");

                }

            } catch (Exception e) {

                output = e.getMessage();

            }

            System.out.println(output);
            input = scanner.nextLine();
        }

    }
}
