package Class8;

public class T2Arrays {

    public static void main(String[] args) {
        boolean[] cond = {true, false, true, false, true, true};
        int count=0;
        for (int i = 0; i<cond.length; i++) {
            if (cond[i]){
                count++;
            }

        }
        System.out.println(count);
    }
}

