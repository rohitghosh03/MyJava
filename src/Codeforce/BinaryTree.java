import java.io.*;
import java.util.*;

public class BinaryTree {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] a = new int[n];
            int[] b = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                b[i] = Integer.parseInt(st.nextToken());
            }

            if (a[n-1] != b[n-1]) {
                System.out.println("NO");
                continue;
            }

            Stack<Integer> stack = new Stack<>();
            int i = 0;
            int j = 0;
            while (i < n && j < n) {
                if (a[i] == b[j]) {
                    i++;
                    j++;
                } else if (!stack.isEmpty() && stack.peek() == b[j]) {
                    stack.pop();
                    j++;
                } else {
                    stack.push(a[i]);
                    i++;
                }
            }
            while (j < n && !stack.isEmpty() && stack.peek() == b[j]) {
                stack.pop();
                j++;
            }
            if (stack.isEmpty() && j == n) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}