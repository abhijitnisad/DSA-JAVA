import java.util.Scanner;

public class compositeAndPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = sc.nextInt();

        /*
        for (int i = 2; i <= num-1; i++) {
            if (num % i == 0) {
                System.out.print("composite number");
            }else System.out.println("Prime number");
            break;
        }
        */

        //Another method
        boolean flag = false;
        // for (int i = 2; i <= num; i++)
             for (int i = 2; i <Math.sqrt(num); i++) {
            if(num % i == 0){
                flag = true;
                break;
        }
        }

            if (num == 1) {
                System.out.println("Neither prime nor composite number");
            }else if (flag == true) {
                System.out.println("Composite number");
            }else {System.out.println("Prime number");}
    }
}
