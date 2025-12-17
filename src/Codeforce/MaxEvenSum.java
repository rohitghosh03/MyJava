import java.util.Scanner;

public class MaxEvenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < t; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            if (a % 2 == 0 && b % 2 == 1) {
                s.append(-1).append("\n");
            } else if (a % 2 == 0 && b % 2 == 0) {
                long cand1 = a + b;
                long cand2 = a * (b / 2) + 2;
                s.append(Math.max(cand1, cand2)).append("\n");
            } else if (a % 2 == 1 && b % 2 == 1) {
                long cand1 = a + b;
                long cand2 = a * b + 1;
                s.append(Math.max(cand1, cand2)).append("\n");
            } else {
                if (b % 4 != 0) {
                    s.append(-1).append("\n");
                } else {
                    long cand1 = 2 * a + (b / 2);
                    long cand2 = a * (b / 2) + 2;
                    s.append(Math.max(cand1, cand2)).append("\n");
                }
            }
        }
        System.out.print(s);
        sc.close();
    }
}