package main.java;

public class Worker implements Calculator {
    @Override
    public void showButtonWork() {
        new Thread(() -> System.out.println("Button was pressed")).start();
    }
}
