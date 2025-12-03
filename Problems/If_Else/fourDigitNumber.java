// package If_Else;

import java.util.Scanner;

public class fourDigitNumber {
    public static void main(String[] args) {
        //check 4 digit number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int x = sc.nextInt();

        if (x>999 && x<10000) {
            System.out.println("yes it is Four digit number");
        }else{
            System.out.println("Not four digit number");
        }


    }

}
