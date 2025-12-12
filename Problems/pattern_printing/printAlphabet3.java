import java.util.Scanner;

public class printAlphabet3 {
        public static void main(String[] args) {
            /*
                HW: Print the given pattern
                aaaa
                BBBB
                cccc
                DDDD
                */

                Scanner sc = new Scanner(System.in);
                System.out.print("Enter number:");
                int n = sc.nextInt();

                for (int i = 1; i<=n; i++) {
                    for (int j = 1; j<=n; j++) {
                        System.out.print((char)(i+96));
                        System.out.println();
                        
                        for (int j2 = 1; j2<=n; j2++) {
                            
                            System.out.print((char)(i+65));
                        }
                    }
                    System.out.println();
                }
        }
}
