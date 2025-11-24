package If_Else;

import java.util.Scanner;

public class areaPerimeter {
    public static void main(String[] args) {
        /*
        Question: Take length and breadth of rectangle as input and write a program
        to find whether the area of rectangle is greater than its perimeter.
         */
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter length:");
        float length = sc.nextFloat();
        System.out.print("Enter Breadth:");
        float breadth = sc.nextFloat();
        float perimeter = length + breadth;
        float area = length*breadth;
        if (area > perimeter) {
            System.out.println("Area is greater than Perimater");
        }else if(perimeter > area){
            System.out.println("Area is less than Perimater");
        }else{
            System.out.println("Both are equal");
        }



    }
}
