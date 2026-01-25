package problems.arrays;

public class rotate_array_by_one_right {
    public static void main(String[] args) {
        int [] arr = {1,2,3,5,6,7,8,10};
        rotate_array_one_right(arr);
    }

    private static void rotate_array_one_right(int[] arr) {
        int n = arr.length;
        int temp;

        for (int i = 0; i < n; i++) {
            temp = i+1;
            if (i != n){
                swap(arr[i],temp);
            }
        else

            {
                swap(arr[i],arr[0]);
            }
    }
        }

    public static void swap(int i,int j) {
        int temp = i;
        i = j;
        j = temp;
    }
    public static void print(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
