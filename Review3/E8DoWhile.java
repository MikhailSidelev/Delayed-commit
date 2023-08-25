package Review3;

import java.util.Scanner;

public class E8DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x;      // Variable to store the price of the current item
        int sum = 0; // Variable to store the total bill

        do {
            System.out.println("Please Enter the price of item or -1 to terminate");
            x = scanner.nextInt();

            if (x != -1) {
                sum = sum + x;
                System.out.println("Your current total bill is " + sum);
            }
        } while (x != -1); // Continue looping until -1 is entered

        System.out.println("Your final total bill is " + sum);
        }

    }
