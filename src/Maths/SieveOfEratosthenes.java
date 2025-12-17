package Maths;
import java.util.*;

public class SieveOfEratosthenes {
    public static List<Integer> solve(int n){
        boolean[] prime=new boolean[n+1];
        List<Integer>arr=new ArrayList<>();
        for(int i=0;i<=n;i++){
            prime[i]=true;
        }
        prime[0]=false;
        prime[1]=false;

        for(int i=2;i*i<=n;i++){
            if(prime[i]){
                for(int j=i*i;j<=n;j+=i) {
                    prime[j] = false;
                }
            }
        }

        for(int i=0;i<=n;i++){
            if(prime[i]){
               arr.add(i);

            }
        }
        System.out.println("Number of primes:"+arr.size());
//        int[]res=new int[count];
//        for(int i=0;i<count;i++){
//            if(prime[i]){
//                res[i++]=i;
//            }
//        }
//        return res;

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(n);
        List<Integer>ans=solve(n);
        System.out.println(ans);

    }
}

