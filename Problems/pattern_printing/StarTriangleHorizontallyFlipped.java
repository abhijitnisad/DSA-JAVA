import java.util.Scanner;

public class StarTriangleHorizontallyFlipped {
    public static void main(String[] args) {

        /*  Star Triangle Horizontally Flipped

         * * * *
         * * *
         * *
         *
         
         */
       
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter number : ");
            int n = sc.nextInt();
            int a = n;
            
            // for (int i = 1; i <= n; i++) {
            //     for (int j = 1; j <=a; j++) {
            //         System.out.print("* ");
            //     }
            //     a--;
            //     System.out.println();
            // }

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <=n+1-i; j++) { // i + j max = n+1 => j max =n+1-i
                    // System.out.print((char) (j+96) + " ");
                    System.out.print("* ");
                }
                // a--;3

                System.out.println();
            }


    }
}
