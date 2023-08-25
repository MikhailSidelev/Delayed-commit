package Class8;

public class T10BreakKeyword {

    public static void main(String[] args) {
        //you have to search the array for number 45 if it's present in the array
        //print found
        int[] nums = {10, 23, 25, 56, 45, 20, -10, -5};
        int target = 45;
        boolean found = false;

        for (int num : nums) {
            if (num == target) {
                found = true;
                break; // Exit the loop since we've found the target
            }
        }

        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");

            }
        }

    }











