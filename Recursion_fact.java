import java.util.Scanner;

public class Recursion_fact {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter number ");
        int n=s.nextInt();
        System.out.println(fact(n));
    }

    private static int fact(int n) {
        if (n==1)
            return 1;
        return n*fact(n-1);
    }
}
