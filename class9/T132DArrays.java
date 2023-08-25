package class9;

public class T132DArrays {
    public static void main(String[] args) {

        String[][] autos = {
                {"Ford", "GMC", "Jeep"},
                {"Audi", "Mercedes", "Opel"},
                {"Hyundai", "KIA", "Genesis"},
                {"Fiat", "Ferrari", "Lamborghini"}
        };

        for (String[] rows : autos) {
            for (String car : rows) {
                System.out.print(car + " ");
            }
            System.out.println();
        }
    }
}

