package problems.sucess_calculator;

import java.util.Scanner;



public class calci {
    public static float percentage(int n , int p){
        int r = (100*n)/p;
        return r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the total number of problems you solved out of");
        int n = sc.nextInt();
        System.out.println("enter the total number of problems you aimed default(5)");
        int p = sc.nextInt();

        float percent = percentage( n , p);
        if (p > 100) {
            System.out.println("good going champ " + percent);
        }else {
            System.out.println(percent);
        }
        System.out.println("if done learning except problem solving then add 30 to your total percent");
    }
}
