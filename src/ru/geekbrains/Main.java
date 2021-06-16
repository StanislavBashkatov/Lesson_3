package ru.geekbrains;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Guess out game");
        int range = 20;
        int random = (int) (Math.random() * range);
        while (true) {
            System.out.println("Guess out the number from 0 to " + range);

            int sysInput = scr.nextInt();

            if (sysInput == random) {
                System.out.println("You got it");
                break;
            }else if (sysInput > random) {
                System.out.printf("Number less than given");
            }else {
                System.out.println("Greater than given");
            }
            }
        scr.close();
        }
    }

