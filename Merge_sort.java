import java.util.Arrays;
import java.util.Scanner;

public class Merge_sort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter size of array- ");
        int n=s.nextInt();
        int ar[]=new int[n];
        System.out.println("enter array- ");
        for (int i = 0; i <n ; i++) {
            ar[i]=s.nextInt();
        }
        mergeSort(ar,0,ar.length-1);
        System.out.println("array after sorting is- "+ Arrays.toString(ar));
    }
    public static void mergeSort(int a[], int beg, int end)
    {
        int mid;
        if(beg<end)
        {
            mid = (beg+end)/2;
            mergeSort(a,beg,mid);
            mergeSort(a,mid+1,end);
            merge(a,beg,mid,end,a.length);
        }
    }
    public static void merge(int a[], int beg, int mid, int end,int n)
    {
        int i=beg,j=mid+1,k,index = beg;
        int temp[]=new int[n];
        while(i<=mid && j<=end)
        {
            if(a[i]<a[j])
            {
                temp[index] = a[i];
                i = i+1;
            }
            else
            {
                temp[index] = a[j];
                j = j+1;
            }
            index++;
        }
        if(i>mid)
        {
            while(j<=end)
            {
                temp[index] = a[j];
                index++;
                j++;
            }
        }
        else
        {
            while(i<=mid)
            {
                temp[index] = a[i];
                index++;
                i++;
            }
        }
        k = beg;
        while(k<index)
        {
            a[k]=temp[k];
            k++;
        }
    }
}
