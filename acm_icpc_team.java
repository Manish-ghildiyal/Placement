import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class acm_icpc_team {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        String[] topic=new String[n];
        for (int i = 0; i <n ; i++) {
            topic[i]=s.nextLine();
        }
        System.out.println(Arrays.toString(check(topic)));
    }

    private static int[] check(String[] topic) {
        int max=0;
        int count=0;
        int ar[]=new int[topic.length];
        HashSet<Integer> hashSet=new HashSet<>();
        for (int i = 0; i <topic.length ; i++) {
            for (int j = i+1; j <topic.length ; j++) {

            }
        }
        return ar;
    }
}
