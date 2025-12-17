import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();

            boolean[] awake = new boolean[n];

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') {
                    // Mark from i to min(i+k, n-1) as awake
                    int end = Math.min(n - 1, i + k);
                    for (int j = i; j <= end; j++) {
                        awake[j] = true;
                    }
                }
            }

            // Count awake classes
            int awakeCount = 0;
            for (int i = 0; i < n; i++) {
                if (awake[i]) {
                    awakeCount++;
                }
            }

            System.out.println(n - awakeCount);
        }
        sc.close();
    }
}