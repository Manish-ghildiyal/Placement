import java.util.HashSet;
import java.util.Scanner;
public class minimum_change {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for (int i = 0; i <t ; i++) {
            String s2=s.next();
            check(s2);
        }
    }

    private static void check(String s) {
        int count=0;
        HashSet<Character> hashSet=new HashSet<>();
        for (int i = 0; i <s.length() ; i++) {
            if (!hashSet.contains(s.charAt(i)))
                hashSet.add(s.charAt(i));
            else count++;
        }
        System.out.println(count);
    }
}
