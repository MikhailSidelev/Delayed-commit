package class5;

import java.util.Scanner;

public class E10Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your country name");
String country=scanner.nextLine();
country=country.toLowerCase();
switch (country){
    case "us":
        System.out.println("English");
        break;
    case "rf":
        System.out.println("Russian");
        break;
    case "germany":
        System.out.println("German");
        break;
    case "france":
        System.out.println("French");
        break;
    default:
        System.out.println("Country is not supported");

}




    }
}
