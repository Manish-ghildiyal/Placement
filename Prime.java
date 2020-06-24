import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter number to check if number is prime or not ");
        int n=s.nextInt();
        System.out.println(prime(n));
    }

    private static boolean prime(int n) {
        if (n==0 || n==1 )
            return false;
        int count=0;
        for (int i = 2; i <=n/2 ; i++) {
            if (n%i==0)
                return false;
        }
        return true;
    }
}
