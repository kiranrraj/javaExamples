import java.io.IOException;

public class ReadInput {
    public static void main(String args[]) throws IOException {
            char ch;
            System.out.println("Press a key");
            ch = (char) System.in.read();
            System.out.println("Your key is : "+ch);
    }
}