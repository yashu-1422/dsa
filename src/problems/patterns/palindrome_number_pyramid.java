package problems.patterns;

public class palindrome_number_pyramid {
    public static void main(String[] args) {
        for(int i = 1;i<=5;i++){
            //spaces.
            for(int j = 1 ; j <= 4-i ;j++){
                System.out.print(" ");
            }
            //print descending
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            //print decending
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
}
}
