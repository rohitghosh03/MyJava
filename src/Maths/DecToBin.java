package Maths;
import java.util.*;
public class DecToBin {
    public static String toBinary(int n) {
        // Using StringBuilder for efficiency
        StringBuilder sb = new StringBuilder();

        if (n == 0) return "0";

        while (n > 0) {
            sb.append(n % 2); // store remainder
            n /= 2;           // divide by 2
        }

        return sb.reverse().toString(); // reverse the result
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int n = sc.nextInt();

        String binary = toBinary(n);
        System.out.println("Binary representation of " + n + " is: " + binary);
    }
}
