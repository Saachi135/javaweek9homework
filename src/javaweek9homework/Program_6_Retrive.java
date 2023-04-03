package javaweek9homework;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */
public class Program_6_Retrive {
    public static void main(String[] args) {
        // Scanner import for user input from console
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter  any digit from 1 To 6 : ");
        int index = scan.nextInt();
        // calling instance method by creating object to main method
        Program_6_Retrive obj = new Program_6_Retrive();
        obj.method1(index);

        // Closing  scanner
        scan.close();

    }

    public void method1(int index){
        // create an arraylist
        ArrayList<String> list = new ArrayList<>();
        // array list assigned from 0 to 6 were 0 is black so it start from 2nd
        list.add(" ");
        list.add("Java");
        list.add("SQL");
        list.add("RestAssured");
        list.add("Cucumber");
        list.add("Selenium");
        list.add("Postman");


        String input = list.get(index);
        System.out.println("User request input " + index + " is " + input);

    }
}
