package Class8;

public class T12EnhancedLoop {

    public static void main(String[] args) {
        int[] nums = {10, 23, 25, 56, 45, 20, -10, -5};
        int smallest = nums[0];

        for (int num : nums) {
            if (num < smallest) {
                smallest = num; // Update smallest if the current number is smaller
            }
        }

        System.out.println(smallest);
        }
    }










