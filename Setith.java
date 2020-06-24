import java.util.Scanner;

public class Setith {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter number");
        int n=s.nextInt();
        System.out.println("enter ith bit u want to set ");
        int i=s.nextInt();
        i=i-1;
        int c=1;
        c=c<<i;
        n=n | c;
        System.out.println(n);
        offbit(n,i);
    }
    public static void offbit(int n,int i)
    {
        int mask=~(1<<i);
        n=n & mask;
        System.out.println(n);
    }
}
