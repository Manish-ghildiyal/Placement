import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter number of rows- ");
        int n=s.nextInt();
        int row=0;
        while (row<n){
            int col=n-row;
            while (col>0){
                System.out.print("*");
                col--;
            }
            System.out.println();
            row++;
        }
    }
}
