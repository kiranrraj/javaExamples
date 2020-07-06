import java.util.Scanner;

public class UserInputUsingScanner {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number : ");
        int number = sc.nextInt();
        System.out.println("Number you entered " + number);

        System.out.println("Please enter a string");
        String string = sc.next();
        System.out.println("String you entered " + string);

        System.out.println("Please enter a number with decimal");
        Double dNum = sc.nextDouble();
        System.out.println("Number you entered " + dNum);

        sc.close();
    }
}