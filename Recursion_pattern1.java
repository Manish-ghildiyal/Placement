import java.util.Scanner;

public class Recursion_pattern1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter no. of rows ");
        int n=s.nextInt();
        patt(n,0);
    }

    public static void patt(int row,int col)
    {
        if(row==0)
            return;
        if(row==col)
        {
            // System.out.println();
            patt(row-1,0);
            System.out.println();
            return;
        }
        //System.out.print("*");
        patt(row,col+1);
        System.out.print("*");


    }
}
