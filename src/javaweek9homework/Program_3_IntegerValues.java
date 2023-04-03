package javaweek9homework;

import java.util.Arrays;

/**
 * Write a Java program to reverse an array of integer values
 */
public class Program_3_IntegerValues {
    // main method declaration
    public static void main(String[] args) {
        int[] abc = {1, 2, 3, 4, 5, 6};

        reverceArray(abc);
        System.out.println(Arrays.toString(abc));

    }

    public static void reverceArray(int[] abc) {
        int start = 0;
        int end = abc.length - 1;
        while (start < end) {
            int zyx = abc[start];
            abc[start] = abc[end];
            abc[end] = zyx;
            start++;
            end--;
        }

    }
}
