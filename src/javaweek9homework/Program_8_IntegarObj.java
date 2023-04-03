package javaweek9homework;

import java.util.HashSet;

/**
 * Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */
public class Program_8_IntegarObj {
    public static void main(String[] args) {                        // main method declaration
        Program_8_IntegarObj obj = new Program_8_IntegarObj();      // object creation
        // instance method calling
        obj.numberSet();
    }
    public void numberSet() {                                       // instance method created
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(4);
        set.add(7);
        set.add(8);

        for (int i = 1; i <= 10; i++) {                             // for loop method
            if (set.contains(i)) {
                System.out.println(i + " is in the set");
            } else {
                System.out.println(i + " is not in the set");
            }
        }
    }
}
