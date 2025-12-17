import java.util.*;

public class Election{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        HashMap<String, Integer> freq = new HashMap<>();

        while (n-- > 0) {
            String str = sc.next().trim();
            freq.put(str, freq.getOrDefault(str, 0) + 1);
        }

        int max = Collections.max(freq.values());

        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == max) {
                System.out.println(entry.getKey());
            }
        }
    }
}
