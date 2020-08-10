import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BetweenTwoSets {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter first array and second array size");
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        List<Integer> ar1=new ArrayList<>();
        List<Integer> ar2=new ArrayList<>();
        System.out.println("enter first array");
        for (int i = 0; i <a ; i++) {
            ar1.add( scanner.nextInt());
        }
        System.out.println("enter second array");
        for (int i = 0; i <b ; i++) {
            ar2.add(scanner.nextInt());
        }
        int c=factors(ar1,ar2);
        System.out.println(c);
    }

    static long gcd(long a, long b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    private static int factors(List<Integer> a, List<Integer> b) {
        long lcm_of_array_elements = 1;
        int divisor = 2;
        int count=0;
        while (true) {
            int counter = 0;
            boolean divisible = false;
            for (int i = 0; i < a.size(); i++) {
                if (a.get(i) == 0) {
                    return 0;
                }
                else if (a.get(i) < 0) {
                    a.set(i,a.get(i) * (-1));
                }
                if (a.get(i) == 1) {
                    counter++;
                }
                if (a.get(i) % divisor == 0) {
                    divisible = true;
                    a.set(i,a.get(i) / divisor);
                }
            }
            if (divisible) {
                lcm_of_array_elements = lcm_of_array_elements * divisor;
            }
            else {
                divisor++;
            }
            if (counter == a.size()) {
                break;
            }
        }
        long result = b.get(0);
        for (int i = 1; i < b.size(); i++)
            result = gcd(b.get(i), result);

        for (long i = lcm_of_array_elements; i <=result ; i++) {
            if (result%i==0 && i%lcm_of_array_elements==0)
                count++;
        }
        return count;
    }

}
