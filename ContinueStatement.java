public class ContinueStatement {
    public static void main(String args[]) {
        for(int i =0; i<5; i++) {
            System.out.println("Value of i : " + i);
            for(int j=0; j<5;j++) {
                if(j%2 == 1) {
                    continue;
                }else {
                    System.out.println("Value of j is "+ j);
                }
            }
        }

        System.out.println("Before label out");
        
        out:

        for(int k =0; k<5; k++) {
            System.out.println("Value of k : " + k);
            for(int l=0; l<5;l++) {
                if(l%2 == 1) {
                    continue out;
                }else {
                    System.out.println("Value of l is "+ l);
                }
            }
        }

        
        System.out.println("Execution finished");
    }
}