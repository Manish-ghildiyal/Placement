import java.util.Arrays;
import java.util.Scanner;

public class Selection_sort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter size of array- ");
        int n=s.nextInt();
        int ar[]=new int[n];
        System.out.println("enter array- ");
        for (int i = 0; i <n ; i++) {
            ar[i]=s.nextInt();
        }
        selection(ar);
        System.out.println("array after sorting is- "+ Arrays.toString(ar));
    }
    public static void selection(int ar[]){
        for (int i = 0; i <ar.length ; i++) {
            int min=min(ar,i);
            swap(ar,i,min);
        }

    }
    public static int min(int ar[],int k){
        int min=k;
        for (int i = k; i <ar.length ; i++) {
            if (ar[i]<ar[min])
                min=i;
        }
        return min;
    }
    public static void swap(int ar[],int i,int min){
        int temp;
        temp=ar[min];
        ar[min]=ar[i];
        ar[i]=temp;
    }
}
