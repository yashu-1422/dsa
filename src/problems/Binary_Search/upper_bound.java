package problems.Binary_Search;

public class upper_bound {
    public static int upper_index(int[] nums, int target) {
        int result = nums.length;
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {

            int mid = (high + low) / 2;

            if (nums[mid] > target) {
                result = mid;
                high = mid -1;
            }else {
              low = mid+1;
            }

        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3,5,8,9,15,19};
        int target = 9;

        int result = upper_index(nums, target);
        System.out.println(result);

    }
}
