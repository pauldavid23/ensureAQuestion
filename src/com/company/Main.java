package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter yes or no: ");
        String answer = scanner.nextLine();
        answer = answer.toLowerCase();
        switch (answer) {
            case "yes":
                System.out.println("Yes?");
                break;
            case "no":
                System.out.println("No?");
                break;
            case "yes?":
                System.out.println(answer);
                break;
            case "no?":
                System.out.println(answer);
                break;
            default:
                System.out.println("Please only enter Yes or No with a question mark or not");
        }




    }
}
