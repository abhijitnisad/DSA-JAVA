package BasicCheege;

import java.util.Scanner;

public class TakeInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      /*
        System.out.BasicCheege.print("Enter your number:");
        int num_1 = sc.nextInt();
        System.out.println("your lucky number:" + num_1);
        System.out.BasicCheege.print("Enter your name:");
        String name = sc.next();
        System.out.println("your  name is " + name);


        //take 2 number input from user and add them

        System.out.BasicCheege.print("Enter 1st number:");
        int num_2 = sc.nextInt();

        System.out.BasicCheege.print("Enter your 2nd number:");
        int num_3 = sc.nextInt();

        System.out.println("Sum:" + (num_2 + num_3));

       */
//##############################################################/
        // Simple interest


        System.out.print("Enter P:");
        double p = sc.nextDouble();
        System.out.print("Enter R:");
        double r = sc.nextDouble();
        System.out.print("Enter T:");
        double t = sc.nextDouble();

        System.out.println("Your P:" + p);
        System.out.println("Your R:" + r);
        System.out.println("Your T:" + t);

        double interest = p*r*t/100;
        System.out.println("Your interest is " + interest);



    }
}
