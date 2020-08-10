import java.math.BigInteger;
import java.util.Scanner;

public class Factorial_BigInteger {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(check(n));
    }

    private static BigInteger check(int n) {
        BigInteger bigInteger=new BigInteger("1");
        for (int i = 1; i <=n ; i++) {
            bigInteger=bigInteger.multiply(BigInteger.valueOf(i));
        }
        return bigInteger;
    }
}
