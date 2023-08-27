package class11;

public class E6StringMethods {
    public static void main(String[] args) {

            // String to be checked
            String str = "Batch 17 is great.";

            // Counter to keep track of occurrences
            int count = 0;

            // Loop through each character in the string
            for (int i = 0; i < str.length(); i++) {
                // Check if the character at index i is 'a'
                if (str.charAt(i) == 'a') {
                    count++;
                }
            }

            // Print the count of occurrences of 'a' (case-insensitive)
            System.out.println(count);
        }
    }

