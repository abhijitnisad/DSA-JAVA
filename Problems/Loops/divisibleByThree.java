public class divisibleByThree {
    public static void main(String[] args) {
        //Print all odd numbers divisible by from 1 to 100;
        for (int i = 1; i <= 100; i=i+2) {
            if (i%3 == 0) {
                System.out.print(i +" ");
            }
        }


    }
}
