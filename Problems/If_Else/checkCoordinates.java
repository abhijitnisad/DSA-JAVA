package If_Else;

import java.util.Scanner;

public class checkCoordinates {
    public static void main(String[] args) {

        /*
        HW: Given a point (x, y), write a program to find out if it lies in the
        1st Quadrant,2nd Quadrant, 3rd Quadrant, 4th Quadrant, on the x-axis, y-axis
        or at the origin.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X-coordinate:");
        float x = sc.nextFloat();
        System.out.print("Enter Y-coordinate:");
        float y = sc.nextFloat();

        if (x==0 && y==0) {
            System.out.println("Its Origin");
        } else if (x== 0) {
            System.out.println("Y-axis");
        } else if (y==0) {
            System.out.println("X-axis");
        } else if (x>0 && y>0) {
            System.out.println("1st Quarent");
        } else if (x<0 && y>0) {
            System.out.println("2nd Quarent");
        } else if (x<0 && y<0) {
            System.out.println("3rd quarent");
        }else if (x>0 && y<0) {
            System.out.println("4rd quarent");
        }

    }
}
