import java.util.Scanner;

public class OddEven_bitmasking {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter number");
        int n=s.nextInt();
        if ((n&1)==0)
            System.out.println("even");
        else System.out.println("odd");
    }
}
