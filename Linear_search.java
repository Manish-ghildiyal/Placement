import java.util.Scanner;

public class Linear_search {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter array size");
        int n=s.nextInt();
        int ar[]=new int[n];
        System.out.println("enter array");
        for (int i = 0; i <ar.length ; i++) {
            ar[i]=s.nextInt();
        }
        System.out.println("enter number you want to search");
        int a=s.nextInt();
        int index=linear(ar,a);
        if (index!=-1)
            System.out.println("element is found and last founded index is- "+index);
        else System.out.println("element not found");
    }

    private static int linear(int[] ar,int a) {
        int index=-1;
        for (int i = 0; i <ar.length ; i++) {
            if (ar[i]==a)
                index=i;
        }
        return index;
    }
}
