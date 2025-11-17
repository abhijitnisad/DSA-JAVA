import java.util.Scanner;

public class area {
    public static void main(String[] args) {
//        double x = 39;
//        double    y = 3;
//        System.out.println(x/y);
//        System.out.println(x*y);

//volume of sphere
        Scanner sc = new Scanner(System.in);
        double  r = sc.nextDouble();
        double areOfSphere = 4.0 / 3.0 * Math.PI * r * r * r;
//        double areOfSphere2 = 4.0 / 3.0 * Math.PI * Math.pow(r ,3);
        System.out.println(areOfSphere);
//        System.out.println(areOfSphere2);
        System.out.println(4.0/3.0 * 3.14 * r * r * r);


        // Total surface area of cuboid
//        Scanner sc = new Scanner(System.in);
//        double l =2 , b = 3 , h =4;
//        System.out.println(l * b * h);


    }
}
