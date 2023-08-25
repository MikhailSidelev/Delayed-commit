package class9;

public class HW5 {
    public static void main(String[] args) {


        String[][] countryList = {
                {"US", "Mexico", "Guatemala", "Canada", "Panama", "Costa Rica", "Honduras", "Venezuela"},
                {"Germany", "Croatia", "France", "Spain", "Poland", "Monaco", "Portugal", "Italy"},
                {"Ganna", "Chad", "Congo", "Niger", "Nigeria", "Burkina Faso", "Senegal", "Egypt"},
                {"Japan", "Korea", "China", "Vietnam", "Cambodia", "Thailand", "Burma"}
        };

        for (int i = 0; i < countryList.length; i++) {
            for (int j = 0; j < countryList[i].length; j++) {
                System.out.print(countryList[i][j] + " ");
            }
            System.out.println();
        }
    }
}


