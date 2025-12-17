package Codeforce;
import java.util.*;

public class MergingSets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int[] count = new int[b + 1];
            int[] set = new int[b + 1];
            Arrays.fill(count, 0);
            Arrays.fill(set, -1);
            boolean[] isResult = new boolean[a];

            for (int i = 0; i < a; i++) {
                int l = sc.nextInt();
                for (int j = 0; j < l; j++) {
                    int x = sc.nextInt();
                    if (count[x] == 0) {
                        count[x] = 1;
                        set[x] = i;
                    } else if (count[x] == 1) {
                        count[x] = 2;
                    } else {
                        count[x]++;
                    }
                }
            }

            boolean result = true;
            for (int x = 1; x <= b; x++) {
                if (count[x] == 0) {
                    result = false;
                    break;
                }
            }
            if (!result) {
                System.out.println("NO");
                continue;
            }

            for (int x = 1; x <= b; x++) {
                if (count[x] == 1) {
                    isResult[set[x]] = true;
                }
            }

            int c = 0;
            for (boolean ans : isResult) {
                if (ans) c++;
            }

            if (c == 0) {
                if (a >= 2) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                if (a - c >= 2) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}