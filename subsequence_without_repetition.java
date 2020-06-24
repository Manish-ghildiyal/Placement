import java.util.HashSet;

public class subsequence_without_repetition {
    public static void main(String[] args) {
        HashSet<String> h=new HashSet<>();
        String processed="";
        String unprocessed="acc";
        sub(processed,unprocessed,h);
    }
    public static void sub(String processed ,String unprocessed,HashSet<String> hashSet)
    {
        if (unprocessed.isEmpty())
        {
            if (!hashSet.contains(processed))
                System.out.println(processed+" ");
            hashSet.add(processed);
            return ;
        }
        char ch=unprocessed.charAt(0);
        unprocessed=unprocessed.substring(1);
        sub(processed,unprocessed,hashSet);
        sub(processed+ch,unprocessed,hashSet);
    }
}
