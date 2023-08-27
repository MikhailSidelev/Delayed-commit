package class11;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Mom's first name?");
        String momFirstName = scanner.nextLine();

        System.out.println("Dad's first name?");
        String dadFirstName = scanner.nextLine();

        System.out.println("boy or girl?");
        String gender = scanner.nextLine();

        String suggestedName;

        if(gender.equalsIgnoreCase("boy")){
            suggestedName = dadFirstName.substring(0, dadFirstName.length()/2) +
                    momFirstName.substring(momFirstName.length()/2);
        }else if (gender.equalsIgnoreCase("girl")){
            suggestedName = momFirstName.substring(0, momFirstName.length()/2) +
                    dadFirstName.substring(dadFirstName.length()/2);
        }else {
            System.out.println("Invalid input for gender. Please enter 'boy' " +
                    "or 'girl' ");
            return;
        }

        System.out.println("Suggested baby name: " + suggestedName);

    }
}


