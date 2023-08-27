package class11;

public class Task2 {
    public static void main(String[] args) {

        String str = "hello";
        // if(!str.isEmpty()){ condition is checked by str.length() below, so optimizing code
        //cancelling first if condition.

        if (str.length() % 2 != 0 && str.length() >= 3) {
            int middle = str.length()/2;
            System.out.println(str.charAt(middle));


        }
    }


}

