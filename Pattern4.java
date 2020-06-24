import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter rows- ");
        int n=s.nextInt();
        int row=1;
        while (row<=2*n-1){
            int space;
            int col;
            if (row<=n){
                space=n-row;
                col=row;
            }
            else {
                space=row-n;
                col=2*n-row;
            }
            while (space>0){
                System.out.print(" ");
                space--;
            }
            while (col>0){
                System.out.print("*");
                col--;
            }
            System.out.println();
            row++;
        }
    }
}
