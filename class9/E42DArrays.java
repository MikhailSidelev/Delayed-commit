package class9;

public class E42DArrays {
    public static void main(String[] args) {

        String [][] names={{"Hind","Mikhail","Ismael","Ahmed"},
                           {"John","Bob","Adam","Tamim"},
                           {"Joke","Laugh","John Ahmed","Mohammad"},
                           {"Gui","Backend","Front","API"}
    };
        String[] row=names[0];//changing rows 0,1,2,3
        //System.out.println(row[3]);// Mohammad
        //System.out.println(row[0]);// John
        for (String name:row){
            System.out.println(name);
        }
}
}
