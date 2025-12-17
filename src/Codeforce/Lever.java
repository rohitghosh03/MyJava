import java.util.Scanner;

public class Lever {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
            }
            long totalDecreases = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] > b[i]) {
                    totalDecreases += (a[i] - b[i]);
                }
            }
            System.out.println(totalDecreases + 1);
        }
        scanner.close();
    }
}