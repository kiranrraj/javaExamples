public class ScopeVariables {
    public static void main(String args[]) {
        
        for(int i=1;i<=10;i++){
            int x = i;
            System.out.println("The value of x inside the for loop "+ x);
            x = 100;
            System.out.println("The current value of x is " + x);
        }
        
    }
}