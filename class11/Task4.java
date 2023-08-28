
package class11;

public class Task4 {
    public static void main(String[] args) {

        String str = "v#$R%E@^&*JU(Z!";
        String reversed="";



        for (int i = str.length() - 1; i >= 0; i--) {
           reversed=reversed+str.charAt(i);
        }
        System.out.println(reversed);  // Print a newline
    }
}