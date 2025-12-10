import java.util.Scanner;

public class alphabetPattern {
    public static void main(String[] args) {

                /*
                HW: Print the given pattern
                AAAA
                BBBB
                CCCC
                */

                Scanner sc = new Scanner(System.in);
                System.out.print("Enter number:");
                int n = sc.nextInt();

                for (int i = 1; i<=n; i++) {
                    for (int j = 1; j<=n; j++) {
                        System.out.print((char)(i + 64));
                    }
                    System.out.println();
                }
    }
}
