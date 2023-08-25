package Class7;

public class HomeWork5 {
    public static void main(String[] args) {
        int[] numbers = {33, 77, 55, 66, 44};
        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("The largest number is: " + largest);
    }




}
