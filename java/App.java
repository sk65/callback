package main.java;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        new App().start();
    }

    public void start() {
        System.out.println("Start App");
        while (true) {
            System.out.println("Enter buttonId");
            Scanner scanner = new Scanner(System.in);
            int buttonId = scanner.nextInt();
            if (buttonId == 4) {
                Calculator calculator = new Worker();
                calculator.showButtonWork();
            }

        }
    }
}
