package problems.arrays;

public class Sum_of_elements_in_array {
    public static int sum(int[] arr){
        int sum = 0;
        int n = arr.length;
        for (int i = 0; i < n ; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7,8,10};
        int sum = sum(arr);
        System.out.println("sum is "+sum);
    }
}
