package javaweek9homework;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */
public class Program_4_EachLoop {
    // Main method declaration
    public static void main(String[] args) {
        Program_4_EachLoop obj = new Program_4_EachLoop();
        obj.colours();

    }
    public void colours() {

        // Scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Colour"); // user input requested
        String abc = scanner.nextLine();
        System.out.println("Enter Second Colour"); // user input requested
        String abc1 = scanner.nextLine();
        System.out.println("Enter Third Colour");   // user input requested
        String abc2 = scanner.nextLine();
        System.out.println("Enter Four");   // user input requested
        String abc3 = scanner.nextLine();
        scanner.close(); // scanner closing

        // New array list
        ArrayList<String> colors = new ArrayList<>();
        // add some color to array list
        colors.add(abc);
        colors.add(abc1);
        colors.add(abc2);
        colors.add(abc3);

        // for loop collection using each loop
        for (String color : colors) {
            System.out.println(color);
        }
    }

}
