import java.util.Scanner;

public class BitChange {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter two number to compare ");
        int n1=s.nextInt();
        int n2=s.nextInt();
        int n=n1^n2;
        System.out.println(n);
        int count=0;
        while (n!=0){
            if ((n&1)==1)
                count++;
            n=n>>1;
        }
        System.out.println(count);
    }
}
