
package class11;

public class E15StringMethods {
    public static void main(String[] args) {


        String str="% $RTdzxaw123 @WW ##QO OOLL## KK";
        System.out.println(str.replaceAll("[A-Z]","*"));
        System.out.println(str.replaceAll("[A-C]","*"));
        System.out.println(str.replaceAll("[a-z]","*"));
        System.out.println(str.replaceAll("[0-9]","*"));
        System.out.println(str.replaceAll("[0-9]",""));
        System.out.println(str.replaceAll(" ",""));
        //below range baced on ASCII table
        System.out.println(str.replaceAll("A-z ",""));
        System.out.println(str.replaceAll("&-; ",""));
        String result = str.replaceAll("[A-Z]", "");
        System.out.println(str.replaceAll("[ks2S] ",""));


    }
    }


