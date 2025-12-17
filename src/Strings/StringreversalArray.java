package Strings;
public class StringreversalArray {
    public static String reverse(String s) {
        if (s == null) return null;
        char[] arr = s.toCharArray();
        int i = 0, j = arr.length - 1;
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String input = "HelloWorld";
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reverse(input));
    }
}
