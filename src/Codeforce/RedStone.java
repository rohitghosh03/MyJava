package Codeforce;

import java.util.*;

public class RedStone {
    public static String solve(int n, int[] arr) {

        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(num)) {
                return "YES";
            }
            set.add(num);
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            String ans = solve(n, arr);
            System.out.println(ans);
        }
    }
}