public class bubblesort {
    public static void main(String arg[]) {
        int ar[] = { 6, 4, 8, 5, 3, 2 };
        for (int i = 0; i < ar.length; i++) {
            for (int j = 1; j < ar.length - i; j++) {
                if (ar[j - 1] > ar[j]) {
                    int tem = ar[j];
                    ar[j] = ar[j - 1];
                    ar[j - 1] = tem;
                }
            }
        }
        System.out.println("Sorted array");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }
}