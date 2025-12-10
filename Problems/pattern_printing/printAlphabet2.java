import java.util.Scanner;

public class printAlphabet2 {
    public static void main(String[] args) {

            /*
                question:Print the given pattern
                AAAA
                BBBB
                cccc
            */

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number:");
        int n = sc.nextInt();

        for (int i = 1; i<=n ; i++) {
            for (int j = 1; j<=n; j++) {
                System.out.println();
            }
        }


    }
}
