import java.util.Scanner;

public class Angry_masterji {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for (int i = 0; i <t ; i++) {
            int n=s.nextInt();
            int k=s.nextInt();
            int ar[]=new int[n];
            for (int j = 0; j <n ; j++) {
                ar[i]=s.nextInt();
            }
            System.out.println(check(k,ar));
        }
    }

    private static String  check(int k, int[] a) {
        int mark=0;
        for (int i = 0; i <a.length ; i++) {
            if (a[i]<=0)
                mark++;
        }
        if (mark<=k)
            return "YES";
        else return "NO";
    }
}
