// package If_Else;

import javax.swing.plaf.TableHeaderUI;
import java.util.Scanner;

public class ternaryInVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int Divya;
//        if (x>=0) Divya = 100; //if number is greater than 0 then 100 other wise 0;
//        else Divya = 0;

       Divya = (x>=0) ? 100 : 0;
        System.out.println("Divya : " + Divya);

        //
    }


}
