package Maths;

import java.util.Scanner;

public class Factorial {
    public static int solve(int a){
        int ans=1;
        if(a==1){
            return 1;
        }
        if(a==0){
            return 0;
        }

        while(a>1){
            ans=a*solve(a-1);
            break;
        }
    return ans;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n= sc.nextInt();
        int result= solve(n);
        System.out.println("The factorial is : " + result);

    }
}
