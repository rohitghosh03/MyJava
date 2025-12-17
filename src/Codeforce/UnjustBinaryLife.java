package Codeforce;
import java.util.*;
import java.io.*;

public class UnjustBinaryLife {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String str1 = br.readLine();
            String str2 = br.readLine();
            char[] a = str1.toCharArray();
            char[] b = str2.toCharArray();

            char a0 = a[0];
            int[] arr1 = new int[n];
            for (int i = 0; i < n; i++) {
                arr1[i] = (a[i] != a0) ? 1 : 0;
            }
            int[] A = new int[n];
            A[0] = arr1[0];
            for (int i = 1; i < n; i++) {
                A[i] = A[i - 1] + arr1[i];
            }

            int[] arr2 = new int[n];
            for (int i = 0; i < n; i++) {
                arr2[i] = (b[i] != a0) ? 1 : 0;
            }
            int[] B = new int[n];
            B[0] = arr2[0];
            for (int i = 1; i < n; i++) {
                B[i] = B[i - 1] + arr2[i];
            }
            long sum1 = 0;
            long sum2 = 0;
            for (int i = 0; i < n; i++) {
                sum1 += B[i];
                sum2 += i;
            }

            int[] C = new int[n];
            for (int i = 0; i < n; i++) {
                C[i] = 2 * B[i] - i;
            }

            List<int[]> X = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                X.add(new int[]{C[i], B[i], i});
            }
            X.sort(Comparator.comparingInt(x -> x[0]));

            long[] prefix = new long[n];
            long[] suffix = new long[n];
            if (n > 0) {
                prefix[0] = X.get(0)[1];
                suffix[0] = X.get(0)[2];
                for (int idx = 1; idx < n; idx++) {
                    prefix[idx] = prefix[idx - 1] + X.get(idx)[1];
                    suffix[idx] = suffix[idx - 1] + X.get(idx)[2];
                }
            }

            long total_ans = 0;
            for (int x = 0; x < n; x++) {
                int c = A[x];
                int T = x + 2 - 2 * c;

                int low = 0;
                int high = n - 1;
                int count = 0;
                while (low <= high) {
                    int mid = (low + high) / 2;
                    if (X.get(mid)[0] <= T) {
                        count = mid + 1;
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }

                long sum_val1 = (count == 0) ? 0 : prefix[count - 1];
                long sum_val2 = (count == 0) ? 0 : suffix[count - 1];

                long term1 = c * (2L * count - n);
                long term2 = (x + 2L) * (n - count);
                long term3 = 2L * sum_val1 - sum1;
                long term4 = sum2 - sum_val2;

                long Fx = term1 + term2 + term3 + term4;
                total_ans += Fx;
            }
            bw.write(total_ans + "\n");
        }
        bw.flush();
    }
}