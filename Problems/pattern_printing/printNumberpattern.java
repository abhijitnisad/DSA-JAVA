import java.util.Scanner;

public class printNumberpattern {
    public static void main(String[] args) {

        /*
      Ques: Print the given pattern
            1111      
            2222
            3333
            4444
        */
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int x = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(x+1);
            }
            x+=1;
            System.out.println();
        }
    }
}
