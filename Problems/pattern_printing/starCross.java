import java.util.Scanner;

public class starCross {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter rows:");
        int m = sc.nextInt();
        System.out.print("enter col:");
        int n = sc.nextInt();
        int p = n;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if(i==j || j==p ) System.out.print("* ");
                else System.out.print( "  ");
            }
            System.out.println();
            p--;
        }


    }
}
