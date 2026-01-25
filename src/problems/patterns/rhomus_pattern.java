package problems.patterns;

public class rhomus_pattern {
    public static void main(String[] args) {
        for (int i=1;i<6;i++){
            for(int j=5;j>=i;j--){
                System.out.print(" ");
            }
            for (int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
