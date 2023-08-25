package Class8;

public class T6EnhancedLoop {

    public static void main(String[] args) {
        // to find largest even numbers
        int[] nums = {10, 77, 25, 56, 60, 20};
        int largestEven = Integer.MIN_VALUE; // Initialize with smallest possible value

        for (int num : nums) {
            if (num % 2 == 0 && num > largestEven) {
                largestEven = num; // Update largestEven if the current number is even and greater
            }
        }

        if (largestEven != Integer.MIN_VALUE) {
            System.out.println("Largest even number: " + largestEven);
        } else {
            System.out.println("No even numbers found.");
        }

        }

    }




