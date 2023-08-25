package class9;

public class HW6 {
    public static void main(String[] args) {


        String[][] countryList = {
                {"US", "Mexico", "Guatemala", "Canada", "Panama", "Costa Rica", "Honduras", "Venezuela"},
                {"Germany", "Croatia", "France", "Spain", "Poland", "Monaco", "Portugal", "Italy"},
                {"Ganna", "Chad", "Congo", "Niger", "Nigeria", "Burkina Faso", "Senegal", "Egypt"},
                {"Japan", "Korea", "China", "Vietnam", "Cambodia", "Thailand", "Burma"}
        };


        int totalCountries = 0;


        for (String[] i : countryList) {
            totalCountries += i.length;
        }

        System.out.println("Total number of countries: " + totalCountries);
    }
}


