import java.util.Scanner;

public class numberPattern2 {
        public static void main(String[] args) {
            /*
            Ques: Print the given pattern
                    1234
                    1234
                    1234
                    1234
            */
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter number:");
                int n = sc.nextInt();

                for (int i = 1; i<=n ; i++) {
                        for (int j = 1; j<=n; j++) {
                            System.out.print(j+0);

                        }
                    System.out.println();
                }


        }

}
