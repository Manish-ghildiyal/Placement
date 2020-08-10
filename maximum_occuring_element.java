import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class maximum_occuring_element {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter array size");
        int n= scanner.nextInt();
        System.out.println("enter array");
        int ar[]=new int[n];
        for (int i = 0; i <n ; i++) {
            ar[i]= scanner.nextInt();
        }
        int res=maxoc(ar);
        int res2=mostFrequent(ar,n);
        System.out.println(res+" "+res2);
    }

    private static int maxoc(int[] arr) {
        Arrays.sort(arr);
        int max_count = 1, res = arr[0];
        int curr_count = 1;

        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] == arr[i - 1])
                curr_count++;
            else
            {
                if (curr_count > max_count)
                {
                    max_count = curr_count;
                    res = arr[i - 1];
                }
                curr_count = 1;
            }
        }

        // If last element is most frequent
        if (curr_count > max_count)
        {
            max_count = curr_count;
            res = arr[arr.length - 1];
        }

        return max_count;
    }
    static int mostFrequent(int arr[], int n)
    {

        // Insert all elements in hash
        Map<Integer, Integer> hp =
                new HashMap<Integer, Integer>();

        for(int i = 0; i < n; i++)
        {
            int key = arr[i];
            if(hp.containsKey(key))
            {
                int freq = hp.get(key);
                freq++;
                hp.put(key, freq);
            }
            else
            {
                hp.put(key, 1);
            }
        }

        // find max frequency.
        int max_count = 0, res = -1;

        for(Map.Entry<Integer, Integer> val : hp.entrySet())
        {
            if (max_count < val.getValue())
            {
                res = val.getKey();
                max_count = val.getValue();
            }
        }

        return res;
    }
}
