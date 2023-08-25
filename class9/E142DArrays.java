package class9;

import java.util.Arrays;

public class E142DArrays {
    public static void main(String[] args) {

        String [][] names={{"Hind","Mikhail","Ismael","Ahmed"},
                           {"John","Bob","Adam","Tamim"},
                           {"Joke","Laugh","John Ahmed","Mohammad"},
                           {"Gui","Backend","Front","API"}
    };

        for(String [] row:names){
            System.out.println(Arrays.toString(row));
        }
}
}
