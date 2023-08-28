
package class11;

public class HomeWork6 {
    public static void main(String[] args) {

//How would you reverse a String word by word? for example
//  input=>This is sentence i want to reverse
//  output=>sihT si ecnetnes i tnaw ot esrever

        String input = "This is sentence I want to reverse";

        String[] words = input.split("\\s"); // Split the input string into words
        StringBuilder reversed = new StringBuilder();

        // Build the reversed string by adding words with reversed letters in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            String word = words[i];
            StringBuilder reversedWord = new StringBuilder();

            // Reverse the letters within the word
            for (int j = word.length() - 1; j >= 0; j--) {
                reversedWord.append(word.charAt(j));
            }

            reversed.append(reversedWord);
            if (i != 0) {
                reversed.append(" ");
            }
        }

        System.out.println("Reversed string: " + reversed.toString());
    }
}







