package problems.Binary_Search;

public class CountOccurrencesSortedArray {

    public static int count(int[] nums, int target) {
        int first = firstOccurrence(nums, target);
        if (first == -1) return 0; // target not found
        int last = lastOccurrence(nums, target);
        return last - first + 1;
    }

    // Find first occurrence
    public static int firstOccurrence(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                result = mid;
                high = mid - 1; // move left
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    // Find last occurrence
    public static int lastOccurrence(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                result = mid;
                low = mid + 1; // move right
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 3, 3, 3, 4};
        int target = 3;

        System.out.println(count(nums, target)); // Output: 4
    }
}
