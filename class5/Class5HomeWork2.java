package class5;

import java.util.Scanner;

public class Class5HomeWork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the country you are living in");
        String country = scanner.nextLine();
        System.out.println("Please Enter the language you speak");
        String language = scanner.nextLine();
        System.out.println("Please Enter the grade of your proficiency in that language - A, B, C, D");
        String grade = scanner.nextLine();
        if (grade.equalsIgnoreCase("A")) {
            System.out.println("A-Excellent");
        } else if (grade.equalsIgnoreCase("B")) {
            System.out.println("B-Good");
        } else if (grade.equalsIgnoreCase("C")) {
            System.out.println("C-Average");
        } else if (grade.equalsIgnoreCase("D")) {
            System.out.println("D-Bad");
        }else
            System.out.println("Not Acceptable");
    }
}
