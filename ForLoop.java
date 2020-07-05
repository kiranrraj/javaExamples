public class ForLoop {
    public static void main (String args[]) {
        int i, sum=0;
        for(i=1; i<=10; i++) {
            sum = sum + i;
            System.out.println("Value of i is "+ i + ". Sum is "+sum+"\n");
        }
    }
}