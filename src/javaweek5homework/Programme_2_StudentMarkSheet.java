package javaweek5homework;

import java.util.Scanner;

/**
 * Rewrite the student mark sheet programme (From java-homework-week3 programmes) using if else and while loop.
 * Write a java program to input student Name, roll No, and three subjects Math, Science and English marks
 * (marks is between 0 to 100 and if it is out of range print error message “Invalid Input, Marks should
 * between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+, %> = 60 A,
 * %> = 50 B, %> = 35 C And print Mark Sheet in following format
 */
public class Programme_2_StudentMarkSheet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Programme_2_StudentMarkSheet obj = new Programme_2_StudentMarkSheet();
        //enter details
        System.out.println("Enter Student name");
        String name = scanner.next();
        System.out.println("Enter roll no");
        int rollNo = scanner.nextInt();
        System.out.println("Enter Math marks");
        int math = scanner.nextInt();

        //verify if math marks are valid
        while (math < 0 || math > 100) {
            System.out.println("Invalid input, Marks should between 0 to 100");
            System.out.println("Enter marks again :");
            math = scanner.nextInt();
        }
        //verify if Science marks are valid
        System.out.println("Enter Science marks");
        int sci = scanner.nextInt();
        while (sci < 0 || sci > 100) {
            System.out.println("Invalid input, Marks should between 0 to 100");
            System.out.println("Enter marks again :");
            sci = scanner.nextInt();
        }
        //verify if English marks are valid
        System.out.println("Enter English marks");
        int eng = scanner.nextInt();
        while (eng < 0 || eng > 100) {
            System.out.println("Invalid input, Marks should between 0 to 100");
            System.out.println("Enter marks again :");
            eng = scanner.nextInt();
        }

        String result = obj.calculateResult(math, sci, eng);
        int totalMarks = obj.sum(math, sci, eng);
        int percentage = (totalMarks * 100) / 300;
        String grade = obj.calculateGrade(percentage, result);
        obj.printMarkSheet(name, rollNo, math, sci, eng, totalMarks, percentage, grade, result);
        scanner.close();
    }

    //total marks method
    public int sum(int math, int sci, int eng) {
        return math + sci + eng;
    }

    //method to check Pass or Fail
    public String calculateResult(int math, int sci, int eng) {
        if (math < 35 || sci < 35 || eng < 35) {
            return "Fail";
        } else {
            return "Pass";
        }
    }

    //method to calculate grade
    public String calculateGrade(int percentage, String result) {
        String grade = null;
        //if pass, then only grade will be calculated otherwise grade print as "-"
        if (result.equalsIgnoreCase("Pass")) {
            if (percentage > 80) {
                grade = "A+";
            } else if (percentage > 60) {
                grade = "A";
            } else if (percentage > 50) {
                grade = "B";
            } else if (percentage > 35) {
                grade = "C";
            }
        } else {
            grade = "-";
        }
        return grade;
    }

    //Printing marksheet
    public void printMarkSheet(String name, int rollNo, int math, int sci, int eng, int totalMarks, int percentage, String grade, String result) {
        System.out.println("-----------------------------");
        System.out.println("|                           |");
        System.out.println("| Mark Sheet                |");
        System.out.println("|___________________________|");
        System.out.println("| Name:" + name + "                  |");
        System.out.println("| Roll No:" + rollNo + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Subjects: Marks           |");
        System.out.println("|___________________________|");
        System.out.println("| Math:" + math + "                   |");
        System.out.println("| Science:" + sci + "                |");
        System.out.println("| English:" + eng + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Total:" + totalMarks + "             |");
        System.out.println("|___________________________|");
        System.out.println("| Percentage:" + percentage + "           |");
        System.out.println("| Result:" + result + "               |");
        System.out.println("| Grade:" + grade + "                  |");
        System.out.println("|___________________________|");
    }


}
