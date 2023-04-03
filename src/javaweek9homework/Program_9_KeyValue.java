package javaweek9homework;

import java.util.HashMap;
import java.util.Map;

public class Program_9_KeyValue {
    public static void main(String[] args) {
        Program_9_KeyValue obj = new Program_9_KeyValue();
        obj.people();
    }

    public void people() {

        Map<String, Integer> people = new HashMap<>();
        people.put("John", 40);
        people.put("Martin", 42);
        people.put("Tom", 35);
        people.put("Harry", 39);

        for (int age : people.values()) {
            System.out.println("Age: " + age);

        }
    }
}

