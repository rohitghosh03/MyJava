package Recursion;
import java.util.*;
public class Subsets {
    public static void solve(String op,String ip){
        if(ip.isEmpty()){
            System.out.println(op);
            return;
        }
        solve(op+ip.charAt(0),ip.substring(1));
        solve(op,ip.substring(1));
    }

    public static void main(String[] args) {
        String op=" ";
        String ip="abc";
        solve(op,ip);
    }
}
