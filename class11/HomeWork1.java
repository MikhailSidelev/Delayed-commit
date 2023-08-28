
package class11;

public class HomeWork1 {
    public static void main(String[] args) {
//How to write it without spaces
        String str = "Hi there how are you doing?";

        // Split the string into an array of words using spaces as the delimiter
        String[] strArr = str.split("\\s");

        // Join the array of words back into a single string without spaces
        String stringWithoutSpaces = String.join("", strArr);

        System.out.println(stringWithoutSpaces);
    }

}