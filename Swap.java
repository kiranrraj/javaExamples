public class Swap {
    public static void main(String[] args){
        int k = 40;
        int q = 50;

        swap(k,q);

        System.out.println("k = " + k);
        System.out.println("q = " + q);

    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}