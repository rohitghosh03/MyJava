package Codeforce;
import java.io.*;

public class AlternatingSeries {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    arr[i] = -1;
                } else {
                    arr[i] = 3;
                }
            }
            if (n % 2 == 0) {
                arr[n - 1] = 2;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(arr[i]);
                if (i < n - 1) {
                    sb.append(" ");
                }
            }
            out.println(sb.toString());
        }
        out.flush();
    }
}