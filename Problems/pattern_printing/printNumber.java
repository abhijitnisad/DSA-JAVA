import java.util.Scanner;

public class printNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        /*
        Ques: Print the given pattern
                1234
                1234
                1234
                1234
        */
      for (int i = 1; i <= num; i++) {
        for (int j = 1; j <= num; j++) {
            System.out.print(j +  " ");
        }
        System.out.println(); 
      }



    }
}
