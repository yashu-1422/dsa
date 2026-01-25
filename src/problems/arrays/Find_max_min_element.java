package problems.arrays;

public class Find_max_min_element {
    public static int min(int[] arr){
        int m=arr[0];
        int n = arr.length;
        for (int j : arr) {
            if (j < m) {
                m = j;
            }
        }
        return m;
    }
    public static int max(int[] arr){
        int h = arr[0];
        int n = arr.length;
        for (int j : arr) {
            if (j > h) {
                h = j;
            }
        }
        return h;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7,8,10};
        int minn = min(arr);
        int maxx = max(arr);
        System.out.println("max "+maxx+" min "+minn);
    }
}
