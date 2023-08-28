
package class11;

public class E7StringMethods {
    public static void main(String[] args) {
            //Upper Class Explanation
            // String to be checked
            String str = "Batch 17 is A great.";

            // Counter to keep track of occurrences
            int count = 0;

            // Loop through each character in the string
            for (int i = 0; i < str.length(); i++) {
                // Check if the character at index i is 'a'
                if (str.charAt(i) == 'a'|| str.charAt(i)=='A') {
                    count++;
                }
            }

            // Print the count of occurrences of 'a' (case-insensitive)
            System.out.println(count);
        }
    }


