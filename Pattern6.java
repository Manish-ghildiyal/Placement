import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter row");
        int n=s.nextInt();
        int row=1;
        int k=n;
        while (row<=2*n-1){
            int space=0;
            int col1;
            int col2;
            col1=k;
            space=2*(n-col1)-1;
            if (space<0)
                space=0;
            col2=2*n-1-col1-space;
            while (col1>0){
                System.out.print("*");
                col1--;
            }
            while (space>0){
                System.out.print(" ");
                space--;
            }
            while (col2>0){
                System.out.print("*");
                col2--;
            }
            if (row<n)
                k--;
            else k++;
            System.out.println();
            row++;
        }
    }
}
