package Codeforce;
import java.util.*;

public class MakeItEqual {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int k = in.nextInt();
            int[] S = new int[n];
            for (int i = 0; i < n; i++) {
                S[i] = in.nextInt();
            }
            int[] T = new int[n];
            for (int i = 0; i < n; i++) {
                T[i] = in.nextInt();
            }

            int count = 0;
            Map<Integer, Integer> groupS = new HashMap<>();
            for (int a : S) {
                int r = a % k;
                if (r == 0) {
                    count++;
                } else {
                    int g = Math.min(r, k - r);
                    groupS.put(g, groupS.getOrDefault(g, 0) + 1);
                }
            }

            int c = 0;
            Map<Integer, Integer> groupT = new HashMap<>();
            for (int b : T) {
                int r = b % k;
                if (r == 0) {
                    c++;
                } else {
                    int g = Math.min(r, k - r);
                    groupT.put(g, groupT.getOrDefault(g, 0) + 1);
                }
            }

            boolean valid = true;
            if (count!= c) {
                valid = false;
            } else if (groupS.size() != groupT.size()) {
                valid = false;
            } else {
                for (int g : groupS.keySet()) {
                    Integer cntT = groupT.get(g);
                    if (cntT == null) {
                        valid = false;
                        break;
                    }
                    if (cntT != groupS.get(g)) {
                        valid = false;
                        break;
                    }
                }
            }

            System.out.println(valid ? "YES" : "NO");
        }
    }
}
