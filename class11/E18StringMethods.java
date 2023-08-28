
package class11;

public class E18StringMethods {
    public static void main(String[] args) {
//splitting by words
        String str = "Hi There how are you.I am Good. I am Driving.";

        String [] strs = str.split(" ");
        System.out.println(strs.length);
        System.out.println(strs[9]);

    }
}

