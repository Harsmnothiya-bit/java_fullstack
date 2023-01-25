public class connection2 {

    public static void main(String arg[]) {
        String str1 = "abc";
        String str2 = "axc";
        func(str1, str2);
    }

    static void func(String str1, String str2) {
        int count = 0;
        for (int i = 0; i < str1.length() - 1; i++) {
            String temp = str1.substring(i, i + 2);
            String temp2 = str2.substring(i, i + 2);
            if (temp == temp2) {
                count++;
            }
        }
        System.out.println(count);
    }
}
