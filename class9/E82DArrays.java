package class9;

public class E82DArrays {
    public static void main(String[] args) {


        int[][] numbers = {
                {10, 20, 30, 40},
                {15, 25, 35,45},
                {16, 26, 36, 46}};

        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) { //numbers[row] =>gives us complete 1D array
                System.out.print(numbers[row][col]+" ");

            }
            System.out.println();
            
        }
        
    }
}
