package Review3;

public class E2LogicalOperators {
    public static void main(String[] args) {
           boolean isMeat=false;
           boolean isEgg=true;
           boolean isFish=false;
           boolean milk=false;
           boolean vegetables=true;


           boolean isProtein=isEgg||isFish||isMeat;
           boolean isGoodDiet=(isEgg||isFish||isMeat) &&milk&&vegetables;
        System.out.println(isProtein);
        System.out.println(isGoodDiet);

    }
}
