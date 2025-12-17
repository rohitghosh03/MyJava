package Codeforce;
import java.util.*;
public class CunningSeller1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();


        long[] c = new long[21];
        c[0] = 3;
        for (int i = 1; i <= 20; i++) {
            long pow1 = (long) Math.pow(3, i+1);
            long pow2 = (long) Math.pow(3, i-1);
            c[i] = pow1 + i * pow2;
        }

        for (int i = 0; i < t; i++) {
            long n = sc.nextLong();
            List<Integer> deals = new ArrayList<>();
            long temp = n;

            while (temp > 0) {
                deals.add((int) (temp % 3));
                temp /= 3;
            }
            long totalcost = 0;
            for (int j = 0; j < deals.size(); j++) {
                int deal = deals.get(j);
                if (deal == 1) {
                    totalcost += c[j];
                } else if (deal == 2) {
                    totalcost += c[j] * 2;
                }
            }
            System.out.println(totalcost);
        }
        sc.close();
    }
}
