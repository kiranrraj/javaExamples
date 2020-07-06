

public class BreakStatementNested {
    public static void main(String args[]) {
        for(int i=0; i<5; i++) {
            System.out.println("value of i is "+i);
            for(int j=0; j<5; j++) {
                System.out.println("Value of j is " + j);
                if(j==2) {
                    break;
                }
            }
        }
        System.out.println("Outside the loop");
        out:

        for(int k=0; k<5; k++) {
            System.out.println("value of k is "+k);
            for(int l=0; l<5; l++) {
                System.out.println("Value of l is " + l);
                if(l==2) {
                    break out;
                }
            }
        }
    }
}
