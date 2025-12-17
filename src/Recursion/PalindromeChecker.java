package Recursion;

public class PalindromeChecker {

    public static boolean isPalindrome(String s) {
        // Base case: An empty string or a string with one character is a palindrome.
        if (s == null || s.length() <= 1) {
            return true;
        }


        // Recursive case:
    // Compare the first and last characters.
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
        // If they are equal, recursively check the substring without the first and last characters.
        return isPalindrome(s.substring(1, s.length() - 1));
    } else {
        // If the first and last characters are not equal, it's not a palindrome.
        return false;
    }
}

public static void main(String[] args) {
    String s1 = "madam";
    String s2 = "racecar";
    String s3 = "hello";
    String s4 = "";
    String s5 = "a";

    System.out.println(s1 + " is a palindrome: " + isPalindrome(s1)); // true
    System.out.println(s2 + " is a palindrome: " + isPalindrome(s2)); // true
    System.out.println(s3 + " is a palindrome: " + isPalindrome(s3)); // false
    System.out.println(s4 + " is a palindrome: " + isPalindrome(s4)); // true
    System.out.println(s5 + " is a palindrome: " + isPalindrome(s5)); // true
}
}
