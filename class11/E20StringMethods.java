package class11;

public class E20StringMethods {
    public static void main(String[] args) {
//splitting by words
        String str = "Hi#There#how#are#you.";
        String [] strArr=str.split("[#]");
        System.out.println(strArr.length);
        System.out.println(strArr[1]);


    }
}
