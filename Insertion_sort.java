import java.util.Arrays;
import java.util.Scanner;

public class Insertion_sort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter size of array- ");
        int n=s.nextInt();
        int ar[]=new int[n];
        System.out.println("enter array- ");
        for (int i = 0; i <n ; i++) {
            ar[i]=s.nextInt();
        }
        insertion(ar);
        System.out.println("array after sorting is- "+ Arrays.toString(ar));
    }
    //using swapping
    public static void insertion(int ar[]){
        int count=0;
        for (int i = 1; i <ar.length ; i++) {
            for (int j = i; j >0 ; j--) {
                if (ar[j]<ar[j-1])
                    swap(ar,j-1,j);
                else break;
            }
        }
    }

    public static void swap(int ar[],int i,int min){
        int temp;
        temp=ar[min];
        ar[min]=ar[i];
        ar[i]=temp;
    }
    //using shifting
    public static void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
