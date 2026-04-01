import java.util.Scanner;

public class starPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter rows:");
        int m = sc.nextInt();
        System.out.print("Enter column:");
        int n = sc.nextInt();
        
        int midRow = (m+1)/2;
        int midCol = (n+1)/2;

        for ( int i = 1; i <=m; i++) {
            for (int j = 1; j <=n; j++) {
                if(i == midRow || j== midCol) 
                    System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }



    }
}
