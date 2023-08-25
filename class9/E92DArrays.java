package class9;

public class E92DArrays {
    public static void main(String[] args) {


        int[][] numbers = {
                {10, 20, 30, 40},
                {15, 25, 35,45},
                {16, 26, 36, 46}};
        int sum=0;
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                sum=sum+numbers[row][col];//numbers[row][col] gives us 10 then 20 then 30 etc.,and
                //addig it to previous

            }

        }
        System.out.println(sum);


        
    }
}
