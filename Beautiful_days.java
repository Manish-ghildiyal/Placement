import java.util.Scanner;

public class Beautiful_days {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i=s.nextInt();
        int j=s.nextInt();
        int k=s.nextInt();
        System.out.println(check(i,j,k));
    }

    private static int check(int i, int j, int k) {
        int mark=0;
        for (int l = i; l <=j ; l++) {
            int n=l;
            int rem=0;
            int num=0;
            while (n!=0){
                rem=n%10;
                num=num*10+rem;
                n=n/10;
            }
            if (Math.abs(l-num)%k==0)
                mark++;
        }
        return mark;
    }
}
