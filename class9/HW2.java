package class9;

public class HW2 {
    public static void main(String[] args) {

        String[][] shopList = {
                {"bread", "tortillas", "chips", "cookies", "carrot cake", "donuts", "muffins", "jello"},
                {"cabbage", "potato", "tomato", "cucumber", "onion", "red leaf", "asparagus", "garlic"},
                {"bananas", "apples", "grapes", "oranges", "pears", "watermelon", "cherries", "mango"},
                {"milk", "yogurt", "cream", "cottage cheese", "cream cheese", "half & half", "sour cream", "chocolate milk"}
        };


        for (String[] row : shopList) {
            for (String item : row) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
}



