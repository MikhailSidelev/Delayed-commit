package class11;

public class HomeWork8 {
    public static void main(String[] args) {

//How would you swap  2 strings without a temporary variable?
        //Using String Concatenation

        String str1 = "qwerty";
        String str2 = "zxcvbn";

        System.out.println("Before swapping:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        str1 = str1 + str2; // Concatenate str1 and str2
        str2 = str1.substring(0, str1.length() - str2.length()); // Extract original str1 from concatenated string
        str1 = str1.substring(str2.length()); // Extract original str2 from concatenated string

        System.out.println("After swapping:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
    }
}









