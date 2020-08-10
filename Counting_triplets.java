import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Counting_triplets {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter size");
        int n=s.nextInt();
        System.out.println("enter common ratio");
        long r=s.nextInt();
        System.out.println("enter list");
        List<Long> list=new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            list.add(s.nextLong());
        }
        System.out.println(check(list,r));
    }

    private static int check(List<Long> arr, long r) {
        int count=0;
        for (int i = 0; i <arr.size() ; i++) {
            for (int j = i+1; j <arr.size() ; j++) {
                for (int k = j+1; k <arr.size() ; k++) {
                    if (arr.get(j)/arr.get(i)==r && arr.get(k)/arr.get(j)==r)
                        count++;
                }
            }
        }
        return count;
    }
}
