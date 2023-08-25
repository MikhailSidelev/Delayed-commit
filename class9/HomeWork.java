package class9;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        // Printing each element multiplied by 10
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] * 10);
        }
    }
}



