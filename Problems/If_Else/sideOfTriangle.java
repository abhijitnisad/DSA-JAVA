// package If_Else;

import java.sql.SQLOutput;
import java.util.Scanner;

public class sideOfTriangle {
    public static void main(String[] args) {
        //Ques: Take 3 positive integers input and tell if they can be the sides of a triangle or not.
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st number:");
        int x = sc.nextInt();
        System.out.print("enter 2nd number:");
        int y = sc.nextInt();
        System.out.print("enter 3rd number:");
        int z = sc.nextInt();

        if((y+z>x) && (x+z>y) && ( x+y>z)){
            System.out.println("Its triange ");
        }else {
            System.out.println("not triange");
        }

    }
}
