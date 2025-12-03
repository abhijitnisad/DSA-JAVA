// package If_Else;

import java.util.Scanner;

public class OddEven  {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*

        //Odd & Even number

        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        if (n%2 == 0){
            System.out.println("Your number " + n  + " which is even");
        }else {
            System.out.println("Your number " + n + "  is odd");
        }
         */

        //#####################################################################################

        // Check divisibility


        System.out.print("Enter your number:");
        int x = sc.nextInt();
        if (x % 5 == 0) {
            System.out.println("Your number is divisible by 5 ");
        }else {
            System.out.println("Not divisible by 5 and remainder is " + (x % 5));
        }
    }
}
