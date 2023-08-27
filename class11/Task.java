package class11;

public class Task {
    public static void main(String[] args) {

        String str = "v#$R%E@^&*JU(Z!";

        // Check if the String is not empty
        if (!str.isEmpty()) {
            int length = str.length();

            // Check if the String has an odd number of characters and has 3 or more characters
            if (length % 2 == 1 && length >= 3) {
                int middleIndex = length / 2;

                // Print all characters of the String
                System.out.print("Characters in the String: ");
                for (int i = 0; i < length; i++) {
                    System.out.print(str.charAt(i) + " ");
                }
                System.out.println();  // Print a newline

                // Print the character in the middle of the String
                System.out.println("Character in the middle: " + str.charAt(middleIndex));
            }
        }
    }
}
