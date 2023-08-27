package class11;

public class E19StringMethods {
    public static void main(String[] args) {
//splitting by words
        String str = "Hi There how are you.I am Good. I am Driving.";
// spase or a dot is a reason to split [.\s]
        String [] strs = str.split("[.\\s]");
        System.out.println(strs.length);
        System.out.println(strs[4]);
        for (String s:strs){
            System.out.println(s);
        }

    }
}
