package If_Else;

import java.util.Scanner;

public class TurnaryBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ood even
        int num = sc.nextInt();
        //Turnary operator => (condition) ? "sahi" :'galat
        System.out.println((num%2== 0) ?"even" :"Odd");


    }
}
