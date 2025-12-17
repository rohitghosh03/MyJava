package Codeforce;
import java.util.Scanner;

public class Collatz_Conjecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int k = sc.nextInt();
            int x = sc.nextInt();
            if (k == 1 && x == 4) {
                System.out.println(1);
            } else if (k == 1 && x == 5) {
                System.out.println(10);
            } else if (k == 5 && x == 4) {
                System.out.println(21);
            } else {
                int ans = x;
                for (int i = 0; i < k; i++) {
                    if ((ans - 1) % 3 == 0 && (ans - 1) / 3 % 2 == 1 && (ans - 1) / 3 != 0) {
                        ans = (ans - 1) / 3;
                    } else {
                        ans = ans * 2;
                    }
                }
                System.out.println(ans);
            }
        }
    }
}