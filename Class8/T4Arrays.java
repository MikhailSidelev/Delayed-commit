package Class8;

public class T4Arrays {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 4, 3, 8, 45, 96};
        int countGreaterThan10 = 0; // Initialize a counter for numbers greater than 10

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 10) {
                countGreaterThan10++; // Increment the counter if the current number is greater than 10
            }
        }

        System.out.println(countGreaterThan10);
    }

    }


