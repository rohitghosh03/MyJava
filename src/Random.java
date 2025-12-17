import java.util.*;

public class Random {
    public static String solve(String ip1, String ip2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ip1.length(); i++) {
            if (ip1.charAt(i) != ip2.charAt(0)) {
                sb.append(ip1.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip1 = sc.next();
        String ip2 = sc.next();
        System.out.println(solve(ip1, ip2));
    }
}
