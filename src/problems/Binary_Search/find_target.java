package problems.Binary_Search;

public class find_target {

    public static int seek_target(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid; // found
            }
            else if (nums[mid] < target) {
                low = mid + 1; // move right
            }
            else {
                high = mid - 1; // move left
            }
        }
        return -1; // not found
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int target = 5;

        int result = seek_target(nums, target);
        System.out.println(result);
    }
}
