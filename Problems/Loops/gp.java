import java.util.Scanner;

public class gp {
    public static void main(String[] args) {
        // Ques: Display this GP - 1, 2, 4, 8  upto 'n' terms

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter terms: ");
        int num = sc.nextInt();
        int a , r;
        a =1;
        r = 2; 
        for (int i = 1; i < num; i++) {
            System.out.print( a + " ");
            a = a*r;

        }


    }
}
