package javaweek9homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterater
 */
public class Program_5_Iteration {
    public static void main(String[] args) {            // main method declaration
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First fruit name");   // user input from console
        String abc = scan.nextLine();
        System.out.println("Enter First fruit name");   // user input from console
        String abc1 = scan.nextLine();
        System.out.println("Enter First fruit name");   // user input from console
        String abc2 = scan.nextLine();

        // object creation to call from instance method
        Program_5_Iteration obj = new Program_5_Iteration();
        obj.fruitsName(abc, abc1, abc2);
        scan.close();

    }

    // instance method is created
    public void fruitsName(String abc, String abc1, String abc2) {

        ArrayList<String> list = new ArrayList<>();
        list.add(abc);
        list.add(abc1);
        list.add(abc2);

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
