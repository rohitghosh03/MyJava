package Maths;

import java.util.Scanner;

public class Fibonacci {
    public static int solve(int a){
        if(a==1){
            return 1;
        }
        if(a==0){
            return 0;

        }
        else{
            return solve(a-1)+solve(a-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n= sc.nextInt();
        System.out.print("The fibonacci series is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(solve(i) + " ");
        }


    }
}
