package Codeforce;

import java.util.Scanner;

public class Bitplus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of operations
        sc.nextLine(); // clear leftover newline

        int x = 0; // the value to modify

        for (int i = 0; i < t; i++) {
            String str = sc.nextLine();
            x = solve(str, x);
        }

        System.out.println(x);
    }

    public static int solve(String str, int x) {
        if (str.equals("X++") || str.equals("++X")) {
            x++;
        } else if (str.equals("X--") || str.equals("--X")) {
            x--;
        }
        return x;
    }
}
