package class11;

public class HomeWork7 {
    public static void main(String[] args) {

//How would you check if String is palindrome or not? aba=> true
//Abbc =>false

        String str1 = "aba";
        String str2 = "Abbc";

        boolean isPalindrome1 = isPalindrome(str1);
        boolean isPalindrome2 = isPalindrome(str2);

        System.out.println(str1 + " is palindrome: " + isPalindrome1);
        System.out.println(str2 + " is palindrome: " + isPalindrome2);
    }

    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase(); // Convert the string to lowercase for case-insensitive comparison
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Characters at current positions are not equal
            }
            left++;
            right--;
        }

        return true; // All characters matched, so it's a palindrome
    }
}









