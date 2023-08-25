package class9;

import java.util.Arrays;

public class E152DArrays {
    public static void main(String[] args) {
//Enhanced loop
        String [][] names={{"Hind","Mikhail","Ismael","Ahmed"},
                           {"John","Bob","Adam","Tamim"},
                           {"Joke","Laugh","John Ahmed","Mohammad"},
                           {"Gui","Backend","Front","API"}
    };

        for(String [] row:names){
            for(String v:row){
                System.out.print(v+" ");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(names)); //to print 2D arrays
}
}
