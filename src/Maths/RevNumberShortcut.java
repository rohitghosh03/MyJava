package Maths;
import java.util.*;
public class RevNumberShortcut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the number : " + n);

        // 🔥 One-liner to reverse
        int rev = Integer.parseInt(new StringBuilder(String.valueOf(n)).reverse().toString());

        System.out.println("The reverse of " + n + " is : " + rev);
    }
}
