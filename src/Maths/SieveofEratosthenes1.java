package Maths;
import java.util.*;

public class SieveofEratosthenes1 {
    public static int[] solve(int n) {
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);//
        prime[0] = false;
        prime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }

        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (prime[i]) count++;
        }

        int[] res = new int[count];
        int idx = 0;
        for (int num = 2; num <= n; num++) {
            if (prime[num]) {
                res[idx++] = num;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] primes = solve(n);
        System.out.println(Arrays.toString(primes));
    }
}

