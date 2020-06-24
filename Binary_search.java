import java.util.Scanner;

public class Binary_search {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter array size");
        int n=s.nextInt();
        int ar[]=new int[n];
        System.out.println("enter array");
        for (int i = 0; i <n ; i++) {
            ar[i]=s.nextInt();
        }
        System.out.println("enter element you want to search");
        int a=s.nextInt();
        int index=binarysearch(ar,a,0,ar.length-1);
        if (index!=-1)
            System.out.println("element found and index is- "+index);
        else System.out.println("element not found");
    }

    private static int binarysearch(int[] ar,int a,int beg,int end) {
        int mid=beg+end/2;
        if (mid<0 || mid>ar.length-1)
            return -1;
        if (ar[mid]==a)
            return mid;
        else if (ar[mid]>a)
            binarysearch(ar,a,beg,mid-1);
        else binarysearch(ar,a,mid+1,end);
        return -1;
    }
}
