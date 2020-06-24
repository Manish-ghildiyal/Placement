import java.util.Scanner;

public class IntegralSquareRoot {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter number ");
        int n=s.nextInt();
        System.out.println(root(n));
    }

    private static int root(int n) {
        if (n==0 || n==1)
            return n;
        int result=0;
        int i=1;
        while (result<=n){
            i++;
            result=i*i;
        }
        return i-1;
    }
}
