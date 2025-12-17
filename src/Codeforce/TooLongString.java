
package Codeforce;
import java.util.Scanner;

public class TooLongString {

    public static String solve(String word) {
        if (word.length() > 10) {
            return "" + word.charAt(0) + (word.length() - 2) + word.charAt(word.length() - 1);
        } else {
            return word;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();  // flush newline

        for (int i = 0; i < n; i++) {
            String word = sc.nextLine();      // read string properly
            System.out.println(solve(word));  // print result
        }
    }
}
