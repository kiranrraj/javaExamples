public class IfStatement {
    public static void main(String args[]) {
        int a,b,c;
        a = 10;
        b = 20;

        if (a>b) System.out.println("A is larger ");
        if (b>a) System.out.println("B is larger ");
        if (a == b) System.out.println("A and B are equal");

        c = a-b;
        if(c>0) {
            System.out.println("C is positive value");
        }if (c<0) {
            System.out.println("C is negative value ");
        }else {
            System.out.println("C is equal to zero");
        }
    }
}