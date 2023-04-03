package javaweek9homework;

import java.util.ArrayList;

/**
 * Declare following two arrylist and compare it.
 * ArrayList<String> c1= new ArrayList<String>();
 * c1.add("Red");
 * c1.add("Green");
 * c1.add("Black");
 * c1.add("White");
 * c1.add("Pink");
 * ArrayList<String> c2= new ArrayList<String>();
 * c2.add("Red");
 * c2.add("Green");
 * c2.add("Black");
 * c2.add("Pink")
 */
public class Program_11_Compare {
    public static void main(String[] args) {              // Main Method created
       Program_11_Compare obj = new Program_11_Compare(); // object crated to call instance method
       obj.compare();
    }

    public void compare(){                                  // instance method created
        ArrayList<String> c1 = new ArrayList<>();           // arraylist created
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2 = new ArrayList<>();           // arraylist created
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("White");

        if (c1.equals(c2)){                                 // comparing to list
            System.out.println("c1 and c2 are equal ");
        }else {
            System.out.println("c1 and c2 are not equal");
        }
    }

}
