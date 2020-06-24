import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter row");
        int n=s.nextInt();
        int row=1;
        int space1=n-row;
        int space2=0;
        while (row<=2*n-1){
            int k=space1;
            int c=space2;
            while (k>0){
                System.out.print(" ");
                k--;
            }
            System.out.print("*");
            while (c>0){
                System.out.print(" ");
                c--;
            }
            if (row!=1 && row!=2*n-1)
                System.out.print("*");
            if (row<n) {
                space2 = 2*(row)-1;
                space1--;
            }
            else {
                space2 = 2*(2*n-row-2)-1;
                space1++;
            }
            System.out.println();
            row++;

        }
    }
}
