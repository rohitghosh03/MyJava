package Codeforce;
import java.util.Scanner;
import java.util.Arrays;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int[] arr = new int[4];
            for(int i = 0; i < 4; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);


            if(arr[0] == arr[1] && arr[1] == arr[2] && arr[2] == arr[3]) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}