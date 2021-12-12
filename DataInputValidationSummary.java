package com.company.module2.summary;

import java.util.Scanner;

public class DataInputValidationSummary {

    public static void main(String[] args) {
        String firstName = getInput("Enter your firstname");
        getFirstName(firstName);

        String lastName = getInput("Enter your lastname");
        getLastName(lastName);

        String email = getInput("Enter your email");
        getEmail(email);

    }

    static String getFirstName(String text) {
        if (isFirstLastnameFieldInvalid(text)) {
            System.out.println("Firstname validation failed: [" + text + "]");
            text = getInput("Enter your firstname again");
            return getFirstName(text);
        } else
            System.out.println("Firstname registered: [" + text + "]");
        return null;
    }

    static String getLastName(String text) {
        if (isFirstLastnameFieldInvalid(text)) {
            System.out.println("Lastname validation failed: [" + text + "]");
            text = getInput("Enter your lastname again");
            return getLastName(text);
        } else
            System.out.println("Lastname registered: [" + text + "]");
        return null;
    }

    static String getEmail(String text) {
        if (isEmailFieldInvalid(text)) {
            System.out.println("Email Validation failed: [" + text + "]");
            text = getInput("Enter your email again");
            return getEmail(text);
        } else
            System.out.println("Email registered: [" + text + "]");
        return null;
    }

    static String getInput(String title) {
        System.out.println(title);
        return new Scanner(System.in).nextLine().strip();
    }

    static boolean isEmailFieldInvalid(String text) {

        boolean hasErrors = false;

        if (text.isEmpty()) {
            hasErrors = true;
            System.out.println("Email cannot be empty");
        }
        if (IsEmailTooShort(text)) {
            hasErrors = true;
            System.out.println("Email should be at least 10 chars long");
        }
        if (isTooLong(text)) {
            hasErrors = true;
            System.out.println("Email cannot exceed more then 30 chars");
        }
        if (isEmailFormatInvalid(text)) {
            hasErrors = true;
            System.out.println("Email format is invalid");
        }
        return hasErrors;
    }

    static boolean isFirstLastnameFieldInvalid(String text) {

        boolean hasErrors = false;

        if (text.isEmpty()) {
            hasErrors = true;
            System.out.println("Firstname and lastname cannot be empty");
        }
        if (IsFirstLastnameTooShort(text)) {
            hasErrors = true;
            System.out.println("Firstname and lastname should be at least 2 chars long");
        }
        if (isTooLong(text)) {
            hasErrors = true;
            System.out.println("Firstname and lastname cannot exceed more then 30 chars");
        }
        if (isFirstLastnameFormatInvalid(text)) {
            hasErrors = true;
            System.out.println("Firstname and lastname format is invalid");
        }
        return hasErrors;
    }

    static boolean isTooLong(String text) {
        return text.length() >= 30;
    }

    static boolean IsEmailTooShort(String text) {
        return text.length() <= 10;
    }

    static boolean IsFirstLastnameTooShort(String text) {
        return text.length() <= 2;
    }

    static boolean isEmailFormatInvalid(String text) {
        return !text.contains("@") || !text.contains(".")
                || text.contains(" ") || text.contains(",") || text.contains("+") || text.contains("-")
                || text.contains("$") || text.contains("#");
    }

    static boolean isFirstLastnameFormatInvalid(String text) {
        return text.contains("@") || text.contains(".") || text.contains(" ") ||
                text.contains("%") || text.contains(",") || text.contains("$") || text.contains("#") ||
                text.contains("1") || text.contains("2") || text.contains("3") || text.contains("4") || text.contains("5") ||
                text.contains("6") || text.contains("7") || text.contains("8") || text.contains("9") || text.contains("0");
    }
}

