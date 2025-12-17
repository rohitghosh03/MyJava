package Codeforce;

import java.util.Scanner;

public class Roundtrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long Rnot = sc.nextLong();
            long x = sc.nextLong();
            long d = sc.nextLong();
            int n = sc.nextInt();
            String s = sc.next();

            long low = Rnot;
            long high = Rnot;
            int count = 0;

            for (int i = 0; i < n; i++) {
                char type = s.charAt(i);
                if (type == '1') {
                    count++;
                    low = Math.max(0, low - d);
                    high = high + d;
                } else {
                    if (low < x) {
                        count++;
                        low = Math.max(0, low - d);
                        high = high + d;
                    }
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}