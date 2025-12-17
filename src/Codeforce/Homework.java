package Codeforce;
import java.util.*;

public class Homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            String a = sc.next();
            int m = sc.nextInt();
            String b = sc.next();
            String c = sc.next();

            StringBuilder s = new StringBuilder(a);
            for (int j = 0; j < m; j++) {
                char ch = b.charAt(j);
                s = (c.charAt(j) == 'V') ? s.insert(0, ch) : s.append(ch);
            }
            System.out.println(s.toString());
        }
        sc.close();
    }
}
