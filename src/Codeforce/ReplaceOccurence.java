package Codeforce;
import java.util.Scanner;

public class ReplaceOccurence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
            }


            int[] f = new int[n + 1];
            for (int i = 0; i < n; i++) {
                if (b[i] <= n) {
                    f[b[i]]++;
                }
            }


            boolean result = true;
            for (int k = 1; k <= n; k++) {
                if (f[k] % k != 0) {
                    result = false;
                    break;
                }
            }

            if (!result) {
                System.out.println(-1);
            } else {

                int[] start = new int[n + 1];
                int ans = 0;
                for (int k = 1; k <= n; k++) {
                    if (f[k] > 0) {
                        int m = f[k] / k;
                        start[k] = ans + 1;
                        ans += m;
                    }
                }


                int[] c = new int[n + 1];
                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    int k = b[i];
                    c[k]++;
                    int idx = (c[k] - 1) / k;
                    arr[i] = start[k] + idx;
                }


                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
        scanner.close();
    }
}