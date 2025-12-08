import java.util.Scanner;

public class printAlphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        /*
        for (int i= 1; i <= n; i++) {
            for (int j = 65; j < 65 + n; j++) {
                System.out.print((char)j);
            }
            System.out.println();
        
        }
        */
//2nd method
        /*  
        for (int i = 1; i <= n; i++) {
            for ( int j = 1; j <= n; j++) {
            System.out.print((char)( j+64) + " ");
            }
            System.out.println();
        }
        */

//for small case

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n ; j++) {
                System.out.print((char)(j + 96) + " ");
            }
            System.out.println();
        }




    }
}
