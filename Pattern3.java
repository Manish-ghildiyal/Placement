import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter number of rows- ");
        int n=s.nextInt();
        int row=1;
        while (row<=2*n-1){
            int col=0;
            if (row<=n)
                col=row;
            else
                col=2*n-row;
            while (col>0){
                System.out.print("*");
                col--;
            }
            System.out.println();
            row++;
        }
    }
}
