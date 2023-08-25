package class9;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {

        String[][] shopList = {
                {"bread", "tortillas", "chips", "cookies", "carrot cake", "donuts", "muffins", "jello"},
                {"cabbage", "potato", "tomato", "cucumber", "onion", "red leaf", "asparagus", "garlic"},
                {"bananas", "apples", "grapes", "oranges", "pears", "watermelon", "cherries", "mango"},
                {"milk", "yogurt", "cream", "cottage cheese", "cream cheese", "half & half", "sour cream"}
        };

        for (int i = 0; i < shopList.length; i++) {
            for (int j = 0; j < shopList[i].length; j++) {
                System.out.print(shopList[i][j] + " ");
            }
            System.out.println();
        }
    }
}



