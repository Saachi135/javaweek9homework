package javaweek9homework.calculate;

import java.util.Scanner;

public class Main extends Calculator {

    public static void main(String[] args) {                // Main Method

        Scanner scan = new Scanner(System.in);              // Scanner declaration from console

        char input = 'Y';
        while (input == 'Y') {


            System.out.println("Enter first Number: ");         // print statement
            int a = scan.nextInt();
            System.out.println("Enter second Number: ");        // print statement
            int b = scan.nextInt();
            System.out.println("Enter any arithmetic symbol: ");// print statement
            char c = scan.next().charAt(0);
            Main obj = new Main();
            obj.calculateResult(a, b, c);
            System.out.println("If you world like to continue Enter 'Y' or 'N' :");
            input = scan.next().charAt(0);
        }
        scan.close();
        System.out.println("Program Close Thank you ");
    }
}
