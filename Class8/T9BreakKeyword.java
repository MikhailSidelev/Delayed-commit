package Class8;

public class T9BreakKeyword {

    public static void main(String[] args) {
        //you have to search the array for number 45 if it's present in the array
        //print found
        int[] nums = {10, 23, 25, 56, 45, 20, -10, -5};


        for (int n:nums) {
            if (n== 45) {
                System.out.println("Found");
                break;

            }
        }

    }
}










