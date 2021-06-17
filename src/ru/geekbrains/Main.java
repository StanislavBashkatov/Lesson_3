package ru.geekbrains;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ваша задача угадать число.");
        int range = 100;
        int number = (int) (Math.random() * range);
        playLevel(range, number);

    }

    private static void playLevel(int range, int number) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Угадайте число от 0 до " + range);
            int input_number = scanner.nextInt();
            if (input_number == number) {
                System.out.println("Вы угадали.");
                break;
            } else if (input_number > number) {
                System.out.println("Загаданное число меньше.");
            } else {
                System.out.println("Загаданное число больше.");
            }
        }
        scanner.close();
    }

}