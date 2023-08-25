package Class6;

import java.util.Scanner;

public class T11ForLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number from 1-10: ");
        int number= scanner.nextInt();


        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + "*" + i + "=" + result);

        }

        }



        }


