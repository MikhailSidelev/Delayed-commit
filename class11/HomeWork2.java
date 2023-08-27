package class11;

public class HomeWork2 {
    public static void main(String[] args) {

        //Create a String that should be combination of letters,
        // numbers and special characters. Find out
        // how many Alphabets(abd AZ) characters are there in the String.

        String str = "%!@#$RTdzxaw123*&^@WW##QO*&^%$nhOOLL##KK";


        // Remove non-alphabet characters and count the remaining characters
        int alphabetCount = str.replaceAll("[^a-zA-Z]", "").length();

        System.out.println("Number of alphabet characters: " + alphabetCount);
    }
}






