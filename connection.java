import java.util.*;

public class connection {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();
        func(str);
    }

    static void func(String str) {
        if (str.length() <= 3) {
            System.out.println(str.toUpperCase());
        } else {
            System.out.println(
                    str.substring(0, str.length() - 3) + str.substring(str.length() - 3, str.length()).toUpperCase());
        }
    }
}
