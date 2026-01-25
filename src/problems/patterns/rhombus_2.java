package problems.patterns;

public class rhombus_2 {
    public static void main(String[] args) {
        int n =5;
        for (int i = 1; i <= n; i++) {
            //space -1
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            //stars -1

            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            //space -2
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*i-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
