package problems.Binary_Search;

public class find_minimuminRotatedSortedArray {

    public static int min(int[] nums){
        int low=0,high= nums.length-1;
        while(low<high){
            int mid = (low+high)/2;
            if (nums[mid] > nums[mid+1]) {
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return nums[low];
    }
    public static void main(String[] args) {
        int [] num = {4,5,6,7,0,1,2,3};
        System.out.println(min(num));
    }
}
