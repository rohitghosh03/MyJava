package Strings;

import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the string : ");

        String str= sc.next();
        String reversed=" ";
        for(int i=str.length()-1;i>=0;i--){
            reversed=reversed + str.charAt(i);
        }
        System.out.println("The reversed string is: " + reversed);

    }
}
