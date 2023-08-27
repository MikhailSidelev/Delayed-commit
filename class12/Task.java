package class12;

import java.util.Scanner;

public class Task {

        void compare () {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter the first number:");
            int num1 = scanner.nextInt();

            System.out.println("Please enter the second number:");
            int num2 = scanner.nextInt();

            if (num1 > num2) {
                System.out.println("The first number is larger: " + num1);
            } else if (num2 > num1) {
                System.out.println("The second number is larger: " + num2);
            } else {
                System.out.println("Both numbers are equal.");
            }

            scanner.close();
        }
    }


