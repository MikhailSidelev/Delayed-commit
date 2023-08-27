package class11;

public class E3StringMethods {
    public static void main(String[] args) {

        String str = "Batch 17 is great.";

        // Using method charAt(0) to get the character at index 0
        System.out.println(str.charAt(0)); // Output: B

        // Using method charAt(4) to get the character at index 4
        System.out.println(str.charAt(4)); // Output:

        // Getting the length of the string using the length() method
        int length = str.length();
        System.out.println(length); // Output: 18

        // Using charAt(str.length()-1) to get the last character of the string
        System.out.println(str.charAt(str.length() - 1)); // Output: .
        System.out.println("*********************************");

        // Storing the length of the string in lastIndex variable
        int lastIndex = str.length();

        // This part seems to have a mistake. You're trying to assign the value of
        // (str.length() - 1) to a char variable, which is not valid.
        //char c = str.length() - 1;
        // Instead, you should use charAt() method to get the last character.
        char lastChar = str.charAt(str.length() - 1);
        System.out.println(lastChar); // Output: .

        // Print the value of the variable lastIndex
        System.out.println(lastIndex); // Output: 18
    }
}