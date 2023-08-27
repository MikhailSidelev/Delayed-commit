package class11;

public class E5StringMethods {
    public static void main(String[] args) {

            // String to be checked
            String str = "Batch 17 is great.";

            // Counter to keep track of occurrences
            int count = 0;

            // Loop through each character in the string
            for (int i = 0; i < str.length(); i++) {
                // Check if the character at index i is 'a' (or 'A')
                if (str.charAt(i) == 'a' || str.charAt(i) == 'A') {
                    count++;
                }
            }

            // Print the count of occurrences of 'a' (case-insensitive)
            System.out.println("The letter 'a' appears " + count + " times.");
        }
    }

