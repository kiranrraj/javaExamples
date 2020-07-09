
public class Calculator {

    public static void main(String[] args){

        class Operations {

            double result;

            public void plus(int num1, int num2){
                result = num1 + num2;
                System.out.println( "Result of Sum is : "+ result);
            }
        
            public void minus(int num1, int num2){
                result = num1 - num2;
                System.out.println("Result of substraction is : "+ result);
            }
        
            public void multiplication(int num1, int num2){
                result = num1 * num2;
                System.out.println("Result of multiplication is : "+ result);
            }
        
            public void division(int num1, int num2){
                result = num1 / num2;
                System.out.println("Result of division is : "+ result);
            }
        }

        Operations obj = new Operations();
        System.out.println("---------------------------");
        obj.plus(10,20);
        obj.minus(30,11);
        obj.multiplication(9,9);
        obj.division(234,2);
    } 
    
}