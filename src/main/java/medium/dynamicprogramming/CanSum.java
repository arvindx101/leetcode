package medium.dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

public class CanSum {

    public boolean canSum(int targetSum, int[] nums)  {
        Map<Integer, Boolean> memo = new HashMap<>();
        return canSum(targetSum, nums, memo);
    }

    public boolean canSum(int targetSum, int[] nums, Map<Integer, Boolean> memo) {

        if(memo.containsKey(targetSum)) return memo.get(targetSum);
        if (targetSum == 0) return true;
        if (targetSum < 0) return false;

        boolean retValue = false;

        for(int num:nums) {
            if(canSum(targetSum-num, nums, memo)) {
                retValue = true;
                break;
            }
        }

        memo.put(targetSum, retValue);
        return retValue;
    }
}
