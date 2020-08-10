import java.util.Scanner;

public class divisible_sum_pairs {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter array size");
        int n=s.nextInt();
        System.out.println("enter factor no");
        int k=s.nextInt();
        int ar[]=new int[n];
        System.out.println("enter array");
        for (int i = 0; i <n ; i++) {
            ar[i]=s.nextInt();
        }
        int count=divisible(n,k,ar);
        System.out.println(count);
    }

    private static int divisible(int n, int k, int[] ar) {
        int count=0;
        int sum;
        for (int i = 0; i <n-1 ; i++) {
            for (int j = i+1; j <n ; j++) {
                sum=ar[i]+ar[j];
                if (sum%k==0)
                    count++;
                sum=0;
            }
        }
        return count;
    }
}
