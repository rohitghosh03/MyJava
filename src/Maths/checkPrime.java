package Maths;

import java.util.Scanner;

public class checkPrime {
    public static boolean solve(int n) {
        if (n <= 1) {
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
    return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : " );
        int n = sc.nextInt();

        if(solve(n)){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
    }
}
