package class9;

public class HW3 {
    public static void main(String[] args) {


        int[][] numbers = {
                {11, 27, 31, },
                {15, 25, 35,},
                {63, 8, 97, }};
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                sum=sum+numbers[i][j];


            }

        }
        System.out.println(sum);



    }
}



