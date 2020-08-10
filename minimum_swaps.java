import java.util.Scanner;

public class minimum_swaps {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter array size");
        int n= scanner.nextInt();
        System.out.println("enter array");
        int ar[]=new int[n];
        for (int i = 0; i <n ; i++) {
            ar[i]= scanner.nextInt();
        }
        int count=minswaps(ar);
        System.out.println(count);
    }

    private static int minswaps(int[] ar) {
        int count=0;
        for (int i = 0; i <ar.length ; i++) {
            while (ar[i]!=i+1){
                int temp=ar[i];
                ar[i]=ar[temp-1];
                ar[temp-1]=temp;
                count++;
            }
        }
        return count;
    }
}
