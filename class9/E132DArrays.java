package class9;

public class E132DArrays {
    public static void main(String[] args) {
//enhanced for loop

        int[][] numbers = {
                {10, 20, 30, 40, 50},
                {15, 25, 35, 45, 20},
                {16, 20, 32, 22, 30}};

        for (int[] row : numbers) {

            for (int col : row) {
                System.out.print(col + " ");

            }
            System.out.println();


        }


    }

}