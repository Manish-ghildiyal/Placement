import java.util.Scanner;

public class PrintPrimeTill_N {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter number");
        int n=s.nextInt();
        prime(n);
    }

    private static void prime(int n) {
        int flag=0;
        for (int i = 2; i <=n ; i++) {
            int k=i;
            flag=0;
            for (int j = 2; j <=k/2 ; j++) {
                if (k%j==0){
                    flag=1;
                    break;
                }
            }
            if (flag==0)
                System.out.println(i);
        }
    }
}
