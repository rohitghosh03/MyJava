package Maths;
import java.util.*;
public class ReverseNumber {
    public static int solve(int n){
        int rev=0;
        while(n>0){
            rev=rev*10+n%10;
            n/=10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n=sc.nextInt();

        int rev = solve(n);
        System.out.println("The reverse of " + n + " is : "+ rev);

    }
}
