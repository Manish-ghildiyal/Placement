import java.util.Scanner;

public class Recursion_fibonacci {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter number ");
        int n=s.nextInt();
        System.out.println(fibo(n-1));
    }

    private static int fibo(int n) {
        if (n==0 || n==1)
            return n;
        return fibo(n-1)+fibo(n-2);
    }
}
