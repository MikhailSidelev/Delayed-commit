package class9;

public class T142DArrays {
    public static void main(String[] args) {

        String[][] autos = {
                {"Ford", "GMC", "Jeep"},
                {"Audi", "Mercedes", "Opel"},
                {"Hyundai", "KIA", "Genesis"},
                {"Fiat", "Ferrari", "Lamborghini"}
        };

        for (int i = 0; i < autos.length; i++) {
            for (int j = 0; j < autos[i].length; j++) {
                System.out.print(autos[i][j] + " ");
            }
            System.out.println();
        }
    }
}

