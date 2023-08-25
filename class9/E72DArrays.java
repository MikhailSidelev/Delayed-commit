package class9;

import java.util.Arrays;

public class E72DArrays {
    public static void main(String[] args) {


        int[][] numbers = {
                {10, 20, 30, 40},
                {15, 25, 35,45},
                {16, 26, 36, 46}};

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                System.out.print(numbers[row][col]+" ");

            }
            System.out.println();
            
        }
        
    }
}
