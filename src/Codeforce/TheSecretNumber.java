package Codeforce;

import java.util.*;
public class TheSecretNumber {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                long n = sc.nextLong();
                Set<Long> c = new HashSet<>();

                for (int j = 1; j <= 18; j++) {
                    long p = 1;
                    for (int k = 0; k < j; k++) {
                        p *= 10;
                    }
                    long d = 1 + p;
                    if (d != 0 && n % d == 0) {
                        long x = n / d;
                        c.add(x);
                    }
                }

                if (c.isEmpty()) {
                    System.out.println(0);
                } else {
                    List<Long> sorted = new ArrayList<>(c);
                    Collections.sort(sorted);
                    System.out.println(sorted.size());
                    for (long x : sorted) {
                        System.out.print(x + " ");
                    }
                    System.out.println();
                }
            }
            sc.close();
        }


}
