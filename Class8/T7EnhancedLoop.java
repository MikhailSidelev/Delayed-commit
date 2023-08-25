package Class8;

public class T7EnhancedLoop {

    public static void main(String[] args) {
        // to find largest even numbers
        int[] nums = {10, 77, 25, 56, 60, 20};
        int largest = nums[0];
        for(int d:nums){
            if(d>largest&& d%2==0){
                largest=d;
            }
        }

        System.out.println(largest);

        }

    }




