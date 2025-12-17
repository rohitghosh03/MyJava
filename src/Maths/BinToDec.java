package Maths;
import java.util.*;
public class BinToDec {
    public static int solve(int n){
        int temp=n;
        int base=1;
        int dec=0;
        while(temp>0){
            int last_digit=temp % 10;
            dec+=last_digit*base;
            temp/=10;
            base=base*2;
        }
        return dec;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
        int dec=solve(n);
        System.out.println("The decimal conversion is : "+ dec);
    }
}
