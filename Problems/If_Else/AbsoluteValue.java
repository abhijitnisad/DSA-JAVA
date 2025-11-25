package If_Else;

import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        // Absolute value
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int a = sc.nextInt();
//        if (a>=0) {
//            System.out.println(a);
//        }else {
//            System.out.println(-a);
//        }

        if(a<0){
            a= -a;
        }
        System.out.println("a:" + a);
    }

}
