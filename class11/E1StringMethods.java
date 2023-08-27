package class11;

public class E1StringMethods {
    public static void main(String[] args) {

        String str="Batch 17 is great.";
// even it's an array, it's different of how array works
        //using method charAt(0)
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(4));
        int lastIndex=str.length();
        System.out.println(lastIndex);
        System.out.println(str.charAt(17));
    }
}
