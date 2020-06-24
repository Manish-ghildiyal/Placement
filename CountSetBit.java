import java.util.Scanner;

public class CountSetBit {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter number ");
        int n=s.nextInt();
        int count=0;
        while (n!=0){
            if ((n&1)==1)
                count++;
            n=n>>1;
        }
        System.out.println(count);
    }
}
