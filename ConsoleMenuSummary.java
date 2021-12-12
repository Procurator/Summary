package com.company.module2.summary;

import java.util.Scanner;

public class ConsoleMenuSummary {
    public static void main(String[] args) {

        printMenu();

    }

    static void printMenu() {
        System.out.println("Select menu options:");
        System.out.println("1 - Enter your name");
        System.out.println("2 - Exit");
        int menuChoice = new Scanner(System.in).nextInt();
        if (menuChoice == 1) {
            printName();
        } else if (menuChoice == 2) {
            exit();
        } else {
            System.err.println("Sorry, there is no such command yet1");
        }
        System.out.println("Return to main menu?");
        System.out.println("Enter Y or N");
        String answer = new Scanner(System.in).nextLine().strip().toLowerCase();
        switch (answer) {
            case "y":
                printMenu();
                break;
            case "n":
                return;
            default:
                System.err.println("Sorry, there is no such command yet4");
        }
    }

    static void printName() {
        System.out.println("Enter your name");
        String name = new Scanner(System.in).nextLine();
        System.out.println(name);
        System.out.println("Enter another name?");
        System.out.println("Enter Y or N");
        String nameAnswer = new Scanner(System.in).nextLine().strip().toLowerCase();
        switch (nameAnswer) {
            case "y":
                printName();
                break;
            case "n":
                break;
            default:
                System.err.println("Sorry, there is no such command yet2");
        }
    }

    static void exit() {
        System.out.println("Do you want to exit?");
        System.out.println("Enter Y or N");
        String exitAnswer = new Scanner(System.in).nextLine().strip().toLowerCase();
        switch (exitAnswer) {
            case "y":
                System.exit(0);
            case "n":
                printMenu();
                break;
            default:
                System.err.println("Sorry, there is no such command yet3");
        }

    }

}
