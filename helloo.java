
import java.util.Scanner;

public class hello {
    public static void main(String args[]) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter name");
        String name = ob.nextLine();
        mkou(name);

    }

    static void mkou(String name) {
        System.out.println("Entered name is " + name);
    }
}