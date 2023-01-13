public class Strings1 {
    public static void main(Strings args[]) {
        String str1 = "Hello";
        String str2 = "Java";
        String str3 = str1.concat(str2);
        System.out.println(str3 + "");
        System.out.println(str1.length());
        System.out.println(str1.indexOf('l'));
        System.out.println(str1.charAt(3));
        System.out.println(str1.compareToIgnoreCase("hEllo"));
        System.out.println(str1.contains("lla"));
        System.out.println(str1.endsWith("e"));
        System.out.println(str2.replace("Java", "Python"));
        System.out.println(str2.toLowerCase());
        System.out.println(str2.toUpperCase());
    }
}