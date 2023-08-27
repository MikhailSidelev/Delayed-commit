package class11;

public class HomeWork3 {
    public static void main(String[] args) {

        //Create a String that should be combination of letters,
        // numbers and special characters. Find out
        // how many numerical characters are there in the String.

        String str = "%!@#$RTdzxaw123*&^@WW##QO*&^%$nhOOLL##KK";


        // Remove non-numeric characters and count the remaining characters
        int numberCount = str.replaceAll("[^0-9]", "").length();

        System.out.println("Number of numbers: " + numberCount);
    }
}






