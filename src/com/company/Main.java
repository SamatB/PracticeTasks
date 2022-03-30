package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println("Sum of numbers: " + number1 + " + " + number2 + " = " + (number1 + number2));
        System.out.println("Multiply of numbers: " + number1 + " * " + number2 + " = " + (number1 * number2));
        System.out.println("Minus dif of numbers: " + number1 + " - " + number2 + " = " + (number1 - number2));
        System.out.println("Division of numbers: " + number1 + " / " + number2 + " = " + (number1 / number2));
    }
}
