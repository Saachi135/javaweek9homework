package javaweek9homework;
/**
 * Write a Java program to test if an array list is empty or not
 */

import java.util.ArrayList;

public class Program_7_EmptyList {
    public static void main(String[] args) {

        Program_7_EmptyList obj = new Program_7_EmptyList();
        obj.Car();

    }

    public boolean Car() {
        ArrayList<String> list = new ArrayList<>();

        list.add(" ");
        list.add("Honda");
        list.add("BMW");
        list.add("Audi");
        list.add("Seat");
        list.add("Toyota");
        list.add("Mercedes");

        if (list.isEmpty()) {
            System.out.println("The ArrayList is empty: ");
            return true;
        } else {
            System.out.println("The ArrayList is not empty: ");
            return false;
        }
    }
}

