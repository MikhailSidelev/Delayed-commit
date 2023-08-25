package class9;

public class HW4 {
    public static void main(String[] args) {


        int[][] numbers = {
                {16, 28, 333, 41},
                {11, 30, 35, 45},
                {6, 23, 36, 146}};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    System.out.print(numbers[i][j] + " ");
                }

            }
            System.out.println();
        }

    }


}