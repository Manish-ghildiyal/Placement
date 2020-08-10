import java.util.Scanner;

public class NthPrime {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter nth prime you want ");
        int n=s.nextInt();
        System.out.println(prime(n));

    }

    private static int prime(int n) {
        int i=2;
        int count=0;
        int flag=0;
        while (true){
            flag=0;
            for (int j = 2; j <=i/2 ; j++) {
                if (i%j==0){
                    flag=1;
                    break;
                }
            }
            if (flag==0)
                count++;
            if (count==n) {
                return i;
            }
            i++;
        }
    }
}
