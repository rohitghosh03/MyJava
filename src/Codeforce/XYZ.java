package Codeforce;
import java.util.*;

public class XYZ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            if (k == 1) {

                for (int i = 0; i < n; i++) {
                    System.out.print((a[i] + (a[i] % 2)) + " ");
                }
                System.out.println();
            } else {
                
                long g = 0;
                for (int i = 1; i < n; i++) {
                    g = gcd(g, Math.abs(a[i] - a[0]));
                }

                if (g == 0) {
                    // All numbers are equal
                    if (a[0] > 1) {
                        for (int i = 0; i < n; i++) {
                            System.out.print(a[i] + " ");
                        }
                    } else {
                        for (int i = 0; i < n; i++) {
                            System.out.print((a[i] + k) + " ");
                        }
                    }
                    System.out.println();
                } else {
                    // Try to find a common modulus d > 1
                    // We'll use d = 2 (make all numbers even) as a fallback
                    long d = 2;
                    for (long candidate = 2; candidate <= g; candidate++) {
                        if (g % candidate == 0 && gcd(candidate, k) > 1) {
                            d = candidate;
                            break;
                        }
                    }

                    long target = a[0] % d;
                    if (target < 0) target += d;

                    for (int i = 0; i < n; i++) {
                        long current = a[i] % d;
                        if (current < 0) current += d;

                        if (current == target) {
                            System.out.print(a[i] + " ");
                        } else if (current < target) {
                            System.out.print((a[i] + (target - current)) + " ");
                        } else {
                            System.out.print((a[i] + (d - current + target)) + " ");
                        }
                    }
                    System.out.println();
                }
            }
        }
    }

    private static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}