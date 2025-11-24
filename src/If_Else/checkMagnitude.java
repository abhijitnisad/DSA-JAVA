package If_Else;

import java.util.Scanner;

public class checkMagnitude {
    public static void main(String[] args) {

        // Take integer input and tell if its magnitude is smaller than 69 or not.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int x = sc.nextInt();
        if (x<0) {
            x= -x;
        }
        if (x>999 && x<10000) {
            System.out.println("Number is 4 digit");
        }else{
            System.out.println("Number is not 4 digit");
        }

    }
}
