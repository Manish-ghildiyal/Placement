import java.util.Scanner;

public class Append_Delete {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        String s=s1.nextLine();
        String t=s1.nextLine();
        int k=s1.nextInt();
        System.out.println(check(s,t,k));
    }

    private static String check(String s, String t, int k) {
        if (k>s.length() && k-s.length()>=t.length())
            return "Yes";
        int mark=0;
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)==t.charAt(i))
                mark++;
            else break;
        }
        int sum=s.length()-mark+(t.length()-mark);
        if (sum<=k)
            return "Yes";
        else return "No";
    }
}
