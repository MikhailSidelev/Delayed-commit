package class5;

import java.util.Scanner;

public class E10OROperator {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Please Enter your height in inches");
        double height = scanner.nextDouble();
        if(height<60) {
            System.out.println("Short");
        }else if(height>=60&&height<=72) {
            System.out.println("Medium");
        }else {
            System.out.println("Tall");
        }
    }
}
