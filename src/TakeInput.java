import java.util.Scanner;

public class TakeInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number:");
        int num_1 = sc.nextInt();
        System.out.println("your lucky number:" + num_1);
        System.out.print("Enter your name:");
        String name = sc.next();
        System.out.println("your  name is " + name);


        //take 2 number input from user and add them

        System.out.print("Enter 1st number:");
        int num_2 = sc.nextInt();

        System.out.print("Enter your 2nd number:");
        int num_3 = sc.nextInt();

        System.out.println("Sum:" + (num_2 + num_3));
    }
}
