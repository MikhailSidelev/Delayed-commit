package class5;

import java.util.Scanner;

public class Class5HomeWork1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your quiz score");
        int quizScore = scanner.nextInt();
        System.out.println("Please Enter your mid term score");
        int midTerm = scanner.nextInt();
        System.out.println("Please Enter your final score");
        int finalScore = scanner.nextInt();
        int result = (quizScore + midTerm + finalScore) / 3;
        if (result >= 90) {
            System.out.println("grade=A");
        } else if (result >= 70 && result < 90) {
            System.out.println("grade=B");
        } else if (result >= 50 && result < 70) {
            System.out.println("grade=C");
        } else if (result < 50) {
            System.out.println("grade=F");
        }
    }
}