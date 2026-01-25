package problems.Binary_Search;

public class floor_ceil_array {
    public static int[] floor_ceil(int [] nums,int target){
        int a = floor(nums,target);
        int b = ceil(nums,target);

        return new int[]{a, b};
    }

    public static int floor(int [] nums,int target) {
        int result =-1;
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {

            int mid = (high + low) / 2;

            if (nums[mid] <= target) {
                result =nums[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }

        return result;
    }
    public static int ceil(int [] nums,int target) {
        int result = -1;
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {

            int mid = (high + low) / 2;

            if (nums[mid] >= target) {
                result =nums[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 4, 7, 8, 10};
        int target = 8;

        int[] result = floor_ceil (nums, target);
        System.out.println(result[0]+" "+result[1]);
    }
}
