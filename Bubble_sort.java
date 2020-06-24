import java.util.Arrays;
import java.util.Scanner;

public class Bubble_sort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter size of array- ");
        int n=s.nextInt();
        int ar[]=new int[n];
        System.out.println("enter array- ");
        for (int i = 0; i <n ; i++) {
            ar[i]=s.nextInt();
        }
        bubble(ar);
        System.out.println("array after sorting is- "+ Arrays.toString(ar));
    }
    public static void bubble(int ar[]){
        int temp=0;
        for (int i = 0; i <ar.length ; i++) {
            for (int j = 0; j <ar.length-1-i; j++) {
                if (ar[j]>ar[j+1]){
                    temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
    }
}
