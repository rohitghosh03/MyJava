package Recursion;
import java.util.*;

public class TowerOfHanoi {

    public static void solve(int s,int d,int h,int n){
        if(n==1){
            System.out.println("Move disk 1 from " + s + " to " + d);
            return;
        }
        solve(s,h,d,n-1);
        System.out.println("Move disk " + n + " from " + s + " to " + d);
        solve(h,d,s,n-1);

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the number of disks: ");
        int n = sc.nextInt();

        System.out.print("Enter the source rod number (e.g. 1): ");
        int s = sc.nextInt();

        System.out.print("Enter the helper rod number (e.g. 2): ");
        int h = sc.nextInt();

        System.out.print("Enter the destination rod number (e.g. 3): ");
        int d = sc.nextInt();

        System.out.println("\nSteps to solve Tower of Hanoi:");
        solve(s,d,h,n);
    }
}
