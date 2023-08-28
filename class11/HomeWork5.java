
package class11;

public class HomeWork5 {
    public static void main(String[] args) {

//How would you reverse a String word by word? for example
//  input=>This is sentence i want to reverse
//  output=>sihT si ecnetnes i tnaw ot esrever

        String input = "This is sentence I want to reverse";

        String[] words = input.split("\\s"); // Split the input string into words
        StringBuilder reversed = new StringBuilder();

        // Build the reversed string by adding words in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }

        System.out.println("Reversed string: " + reversed.toString());
    }
}








