package If_Else;

import java.util.Scanner;

public class checkDivisibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st number : ");
        double x = sc.nextDouble();


        if (x % 3 == 0 && x % 5 == 0) {
            System.out.println("Number is divisible by 3  & 5 both");
        } else if (x % 5 == 0) {
            System.out.println("Number is divisible by 5");
        } else if (x% 3 == 0) {
        System.out.println("Number is divisible by 3");
        }else{
            System.out.println("Number is not divisible by 3 and 5");
        }
    }
}
