
package Codeforce;
import java.util.*;
public class EqualOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            List<Integer> freq = new ArrayList<>();
            int current = arr[0];
            int count = 1;
            for (int i = 1; i < n; i++) {
                if (arr[i] == current) {
                    count++;
                } else {
                    freq.add(count);
                    current = arr[i];
                    count = 1;
                }
            }
            freq.add(count);

            int maxFreq = Collections.max(freq);
            int ans = 0;
            for (int k = 1; k <= maxFreq; k++) {
                int c = 0;
                for (int f : freq) {
                    if (f >= k) {
                        c++;
                    }
                }
                ans = Math.max(ans, k * c);
            }
            System.out.println(ans);
        }
    }
}
