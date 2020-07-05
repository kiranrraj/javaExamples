import java.util.Scanner;

public class UserInputUsingScanner {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Number you entered " + number);

        sc.close();
    }
}