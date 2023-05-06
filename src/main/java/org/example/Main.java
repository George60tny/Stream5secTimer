package org.example;

public class Main {
    public static void main(String[] args) {
        Thread timerThread = new Thread(() -> {
            int secondsPassed = 0;
            while (true) {
                try {
                    Thread.sleep(1000);
                    secondsPassed++;
                    System.out.println("Прошло времени: " + secondsPassed + " секунд");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread messageThread = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(5000);
                    System.out.println("Прошло 5 секунд");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        timerThread.start();
        messageThread.start();
    }
}