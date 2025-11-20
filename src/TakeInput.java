import java.util.Scanner;

public class TakeInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number:");
        int num_1 = sc.nextInt();
        System.out.print("your lucky number:" + num_1);
        System.out.println("Enter your name:");
        String name = sc.next();
        System.out.println("your  name is " + name);


    }
}
