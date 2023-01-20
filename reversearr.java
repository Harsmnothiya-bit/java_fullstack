public class reversearr {
    public static void main(String arggs[]) {
        int ar[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int i = 0;
        int temp = ar.length - 1;
        while (i != temp) {
            ar[temp] += ar[i];
            ar[i] = ar[temp] - ar[i];
            ar[temp] = ar[temp] - ar[i];
            i++;
            temp--;
        }
        System.out.println("arrays now");

        for (int j = 0; j < ar.length; j++) {
            System.out.print(ar[j] + " ");
        }
    }
}
