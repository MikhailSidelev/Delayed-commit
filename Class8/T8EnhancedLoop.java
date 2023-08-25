package Class8;

public class T8EnhancedLoop {

    public static void main(String[] args) {
        //replace negative numbers with 0
        int[] nums = {10, 23, 25, 56, 45, 20, -10, -5};


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                nums[i] = 0;
            }
        }

        // Print the modified array
        for (int num : nums) {
            System.out.println(num);
        }
    }
}










