package Review3;

import java.util.Scanner;

public class E4Switch {
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please Enter the name of the Fruit");
            String fruit = scanner.nextLine();

            switch (fruit) {
                case "Orange":
                    System.out.println("It is usually Orange");
                    break;
                case "Banana":
                    System.out.println("Yellow Bananas are good");
                    break;
                case "Blue berry":
                    System.out.println("Blue berries are very Good for heart");
                    break;
                default:
                    System.out.println("I don't like this fruit");

            }


        }

    }
}