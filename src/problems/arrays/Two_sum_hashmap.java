package problems.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Two_sum_hashmap {

    private static int[] twoHashSum(int[] nums, int target) {
        Map<Integer,Integer>map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            int needNum = target - currentNum;
            if(map.containsKey(needNum)){
                return new int[]{map.get(needNum),i};
            }
            else{
                map.put(currentNum,i);
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = twoHashSum(nums,target);
        System.out.println(Arrays.toString(result));
    }


}
