package Codeforce;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeActivities {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr1=new int[n];
            int[] arr2=new int[n];
            int[] arr3=new int[n];
            for(int i=0;i<n;i++){
                arr1[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                arr2[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                arr3[i]=sc.nextInt();
            }

            Arrays.sort(arr1);
            Arrays.sort(arr2);
            Arrays.sort(arr3);

            System.out.println(arr1[n-1]+arr2[n-1]+arr3[n-1]);
        }
    }
}
