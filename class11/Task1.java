package class11;

public class Task1 {
    public static void main(String[] args) {

        String str = "v#$R%E@^&*JU(Z!";

        // Print the string in reverse order
        System.out.print("String in reverse order: ");
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();  // Print a newline
    }
}