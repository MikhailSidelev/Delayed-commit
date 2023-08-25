package Review3;

import java.util.Scanner;

public class T1LogicalOperators {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Do you know how to swim?");
        boolean swim=scanner.nextBoolean();
        System.out.println("Do you certified to do CPR?");
        boolean sertified=scanner.nextBoolean();
        if(swim&&sertified){
            System.out.println("You hired as a life guard");
        }else{
            System.out.println("your application rejected");
        }


    }
}
