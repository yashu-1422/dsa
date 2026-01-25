package problems.Binary_Search;

public class lower_bound {
    public static int lowest_index(int[] nums, int target) {
        int result = -1;
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) / 2);

            if (nums[mid] >= target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3, 5, 8, 15, 19};
        int target = 9;

        int result = lowest_index(nums, target);
        System.out.println(result);

    }
}
