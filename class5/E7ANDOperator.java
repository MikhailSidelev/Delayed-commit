package class5;

public class E7ANDOperator {
    public static void main(String[] args){

        boolean goodCredit=false;
        boolean stableJob=true;
        boolean minimalAge=true;
        if(goodCredit&&stableJob&&minimalAge){
            System.out.println("You have the loan");
        }else{
            System.out.println("You need to fulfill the requirements");
        }


    }
}
