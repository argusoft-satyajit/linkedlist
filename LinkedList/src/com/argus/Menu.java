package com.argus;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Satyajit
 */
public class Menu {

    private static final String MENU = "1. Append an element into the linkedlist\n"
            + "2. Remove the tail element from a linkedlist\n"
            + "3. Remove all element in the linkedlist that is greater than a target value\n\n"
            + "What do you want to do : ";

    private final Scanner reader = new Scanner(System.in);

    /**
     * Asking what to do from main menu.
     *
     * @return selected option
     */
    public int ask() {
        int option = 0;
        try {
            System.out.print(MENU);
            option = reader.nextInt(); // Scans the next token of the input as an int
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!\n");
            reader.next();
        }
        return option;
    }

    /**
     * Asking secondary question based on selected menu option.
     *
     * @param option menu option from main menu
     * @return input of secondary question or 0
     */
    public int next(int option) {
        int result = 0;
        try {
            switch (option) {
                case 1:
                    System.out.print("Enter element needs to be appended : ");
                    result = reader.nextInt(); // Scans the next token of the input as an int
                    break;
                case 2:
                    break;
                case 3:
                    System.out.print("Enter target value : ");
                    result = reader.nextInt(); // Scans the next token of the input as an int
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid value!\n");
            reader.next(); // this consumes the invalid token
        }
        return result;
    }
}
