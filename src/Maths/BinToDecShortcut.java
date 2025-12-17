package Maths;
import java.util.*;
public class BinToDecShortcut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binary = sc.next();  // take binary as string (e.g., "1010")

        // 🔥 One-liner conversion
        int decimal = Integer.parseInt(binary, 2);

        System.out.println("Decimal representation of " + binary + " is: " + decimal);

    }
}
