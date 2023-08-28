
package class11;

public class E21StringMethods {
    public static void main(String[] args) {
//splitting by words
        String str = "Hi There how are you.";
        String [] strArr=str.split("\\s");
        System.out.println(strArr.length);
        System.out.println(strArr[1]);


    }
}

