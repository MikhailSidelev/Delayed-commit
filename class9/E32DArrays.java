package class9;

import java.util.Arrays;

public class E32DArrays {
    public static void main(String[] args) {

        String [][] names={{"Hind","Mikhail","Ismael","Ahmed"},
                           {"John","Bob","Adam","Tamim"},
                           {"Joke","Laugh","John Ahmed","Mohammad"},
                           {"Gui","Backend","Front","API"}
    };
        String[] row=names[2];
        System.out.println(row[3]);// Mohammad
        System.out.println(row[0]);// John
}
}
