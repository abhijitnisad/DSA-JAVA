package If_Else;

import java.util.Scanner;

public class CheckInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take real number and check integer or not;
        System.out.println("Enter number:");
        double x = sc.nextDouble();
//        if (x%x == 1) {
//            System.out.println("Integer number");
//        }else{
//            System.out.println("Not integer");
//    }

//        another ways to check
        int y = (int)x;
        if (x-y > 0) {
            System.out.print("Not an integer");
        }else {
            System.out.println("an integer number");
        }
}   }
