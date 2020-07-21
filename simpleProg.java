public class simpleProg {
    public static void main(String[] args){
        double y = 1/3;
        double a=1.0, b = 3.0;
        double z = a/b;
        System.out.println("Value of y is : "+y);   // 0.0
        System.out.println("Value of z is : "+z);   // 0.333333333
    
    // y=1/3 gives 0.0 because 1 nad 3 are int value so when 1 is
    // divided by 3 we get value of 0.3333 as bioth 1 and 3 are int
    // 0.3333 is converted to int, so the value become 0. 
    }
}