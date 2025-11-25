package If_Else;

import java.util.Scanner;

public class checkGreatestOfThree {
    public static void main(String[] args) {

        /*
        Ques: Take 3 positive integers input and print the greatest of them.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number , x :");
        float x = sc.nextFloat();
        System.out.print("Enter 2nd number , y :");
        float y = sc.nextFloat();
        System.out.print("Enter 3rd number , z :");
        float z = sc.nextFloat();
        /*

        if (x==y && y==z){
            System.out.println("equal number" + x);
        } else if (x>y && x>z) {
            System.out.println("Number x is greater :" + x);
        } else if (y>z && y>x) {
            System.out.println("Number y is greater :" + y);
        }else {
            System.out.println("Number z is greater :" +z);
        }
*/

        //#################### Nested if #############################################
        //Do same above question.

        /*
        if (x >= y) {// ture hua to means y to sabse bada nhi hai
            if (x >= z) {
                System.out.println(x);
            } else {
                System.out.println(z);
            }
        } else { //y>x iska matlab x to bada nhi hai
            if (y >= z) {
                System.out.println(y);
            } else { //z>y
                System.out.println(z);
            }
        }
         */


        /*
//        Ques: Take 3 positive integers input and print the least of them.
        if (x<=y) {//means y to bada hai ,ye to nhi hoga
            if (x<=z) {
                System.out.println(x);
            }else {//z<x
                System.out.println(z);
            }
        }else{ //y<x , means x to chota nhi hoga
            if (y<=z) {
                System.out.println(y);
            }else { //z<y
                System.out.println(z);
            }
        }
         */

        //Using nested ternary
        System.out.println((x>y)?   (x>z)?x:z          : (y>z)?y:z);

    }

}
