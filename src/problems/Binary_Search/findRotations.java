package problems.Binary_Search;



public class findRotations {
    public static int rotations(int[] nums){
        int low =0,high= nums.length-1;
        while(low<high){
            int mid = (low+high)/2;

            if(nums[mid]>nums[mid+1]){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int [] nums = {4,5,6,7,0,1,2,3};
        System.out.println(rotations(nums));
    }
}
