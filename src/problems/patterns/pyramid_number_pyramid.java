package problems.patterns;

public class pyramid_number_pyramid {
    public static void main(String[] args) {
        for(int i = 1;i<=5;i++){
            //spaces.
            for(int j = 1 ; j <= 4-i ;j++){
                System.out.print(" ");
            }
            //print descending
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
