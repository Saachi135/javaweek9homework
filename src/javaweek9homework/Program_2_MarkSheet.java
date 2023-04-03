package javaweek9homework;

import java.util.Scanner;

public class Program_2_MarkSheet {
    public static void main(String[] args) {
        // Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student Name : ");
        String name = scanner.nextLine();
        System.out.println("Enter Student Roll Number :");
        int rollNum = scanner.nextInt();
        System.out.println("Enter Marks of Subject Maths  : ");
        int mathsMarks = scanner.nextInt();
        while (mathsMarks < 0 || mathsMarks > 100) {
            System.out.println("Invalid input, Marks should between 0 to 100 ");
            System.out.println("Please enter correct marks :");
            mathsMarks = scanner.nextInt();
        }
        System.out.println("Enter Marks of Subject Science :");
        int scienceMarks = scanner.nextInt();
        while (scienceMarks < 0 || scienceMarks > 100) {
            System.out.println("Invalid input, Marks should betwen 0 to 100");
            System.out.println("Please enter correct marks :");
            scienceMarks = scanner.nextInt();
        }
        System.out.println("Enter Marks of Subject English :");
        int englisMarks = scanner.nextInt();
        while (englisMarks < 0 || englisMarks > 100) {
            System.out.println("Invalid input, Marks should between 0 to 100");
            System.out.println("Please enter correct marks :");
            englisMarks = scanner.nextInt();
        }
        int total = sum(mathsMarks, scienceMarks, englisMarks);
        int percentage = (total * 100) / 300;
        String result = calculateResult(mathsMarks, scienceMarks, englisMarks);
        String grade = calulateGrade(percentage, result);
        printTheMarkSheet(name, rollNum, mathsMarks, scienceMarks, englisMarks, total, percentage, result, grade);
        //Closing the scanner object
        scanner.close();
    }

    // calculating the sum
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // calculating the results on subjects marks
    public static String calculateResult(int mathsMarks, int scienceMarks, int englishMarks) {
        while (mathsMarks < 35 || scienceMarks < 35 || englishMarks < 35) {
            System.out.println("Fail");
        }
        return "Pass";
    }


    // Calculating the grade on percentage and result
    public static String calulateGrade(int percentage, String result) {
        String grade = null;
        if (result.equalsIgnoreCase("Pass")) {
            if (percentage >= 80) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else if (percentage >= 35) {
                grade = "C";
            }
        } else {
            grade = "-";
        }
        return grade;
    }

    // Printing the Marks Sheet
    public static void printTheMarkSheet(String name, int rollNum, int mathsMarks, int scienceMarks,
                                         int englishMarks, double total, double percentage, String result, String grade) {
        System.out.println("-----------------------------");
        System.out.println("|                           |");
        System.out.println("| Mark Sheet                |");
        System.out.println("|___________________________|");
        System.out.println("| Name:" + name + "                  |");
        System.out.println("| Roll No:" + rollNum + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Subjects: Marks           |");
        System.out.println("|___________________________|");
        System.out.println("| Math:" + mathsMarks + "                   |");
        System.out.println("| Science:" + scienceMarks + "                |");
        System.out.println("| English:" + englishMarks + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Total:" + total + "             |");
        System.out.println("|___________________________|");
        System.out.println("| Percentage:" + percentage + "           |");
        System.out.println("| Result:" + result + "               |");
        System.out.println("| Grade:" + grade + "                  |");
        System.out.println("|___________________________|");
    }
}

