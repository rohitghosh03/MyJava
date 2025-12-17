import java.util.Scanner;

public class Practice {
    public static void  main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int rev=0;
//        while(n>0){
//            int ones = n%10;
//            rev=rev*10+ones;
//            n=n/10;
//        }
//        System.out.println(rev);
//        int a=5;int b=10;
//        a=a^b;
//        b=a^b;
//        a=a^b;
//        System.out.println(a);System.out.println(b);
        int n = 12;

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                if (i != n / i) {
                    System.out.print((n / i) + " ");
                }
            }
        }

    }

}
