package class11;

public class Task5 {
    public static void main(String[] args) {

        String str = "He There how are you@#@%. I am Good. How are you?";

        // Replace "There" with "there"
        String newStr1 = str.replace("There", "there");

        // Replace "how" with "you"
        String newStr2 = newStr1.replace("you@#@%", "you");

        // Replace "Good" with "good"
        String newStr3 = newStr2.replace("Good", "good");

        System.out.println(newStr3);
    }
}