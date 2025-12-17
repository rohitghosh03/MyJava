package Codeforce;
import java.util.*;

public class CunningSeller2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();


        long[] c = new long[41];
        c[0] = 3;
        for (int i = 1; i <= 40; i++) {
            long pow1 = (long) Math.pow(3, i+1);
            long pow2 = (long) Math.pow(3, i-1);
            c[i] = pow1 + i * pow2;
        }

        for (int i = 0; i < t; i++) {
            long n = sc.nextLong();
            int l = sc.nextInt();

            if (n > 10000 || l > 10000) {

                System.out.println(-1);
                continue;
            }

            long[] dp = new long[(int)n+1];
            Arrays.fill(dp, Long.MAX_VALUE);
            dp[0] = 0;
            for (int deals = 1; deals <= l; deals++) {
                for (int j = (int)n; j >= 0; j--) {
                    if (dp[j] == Long.MAX_VALUE) continue;
                    for (int x = 0; x <= 40; x++) {
                        long next = j + (long)Math.pow(3, x);
                        if (next > n) continue;
                        int nextInt = (int)next;
                        if (dp[nextInt] > dp[j] + c[x]) {
                            dp[nextInt] = dp[j] + c[x];
                        }
                    }
                }
            }
            if (dp[(int)n] == Long.MAX_VALUE) {
                System.out.println(-1);
            } else {
                System.out.println(dp[(int)n]);
            }
        }



        sc.close();
    }
}