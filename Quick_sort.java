import java.util.Arrays;
import java.util.Scanner;

public class Quick_sort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter size of array- ");
        int n=s.nextInt();
        int ar[]=new int[n];
        System.out.println("enter array- ");
        for (int i = 0; i <n ; i++) {
            ar[i]=s.nextInt();
        }
        quicksort(ar,0,ar.length-1);
        System.out.println("array after sorting is- "+ Arrays.toString(ar));
    }
    public static void quicksort(int ar[],int p,int q){
        if (p<q){
            int m=partition(ar,p,q);
            quicksort(ar,p,m-1);
            quicksort(ar,m+1,q);
            return;
        }
    }
    public static int partition(int ar[],int p,int q){
        int x=ar[p];
        int i=p;
        for (int j = p+1; j <=q ; j++) {
            if (ar[j]<=x){
                i++;
                swap(ar,i,j);
            }
        }
        swap(ar,i,p);
        return i;
    }
    public static void swap(int ar[],int i,int min){
        int temp;
        temp=ar[min];
        ar[min]=ar[i];
        ar[i]=temp;
    }
}
