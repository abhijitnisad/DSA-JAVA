// package If_Else;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter CP:");
        double cp = sc.nextDouble();
        System.out.print("Enter SP:");
        double sp  = sc.nextDouble();

        if (sp == cp) {
            System.out.println("No loss");
        }else if(sp > cp){
            System.out.println("Profit " + (sp-cp));
        }else if(sp<cp){
            System.out.println("Loss " + (cp-sp));
        }
}}
