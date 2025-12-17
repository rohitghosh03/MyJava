package Strings;

import java.util.Scanner;

public class VowelsCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine().toLowerCase(); // convert to lowercase for easy checking

        boolean hasVowel = false;

        for (char ch : s.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                hasVowel = true;
                break; // no need to check further once vowel found
            }
        }

        if (hasVowel) {
            System.out.println("The string contains at least one vowel.");
        } else {
            System.out.println("The string does not contain any vowel.");
        }
    }
}
