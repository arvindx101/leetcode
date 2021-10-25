package easy.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TwoSum {

    public boolean twoSum(int[] nums, int targetSum) {
        boolean result = false;
        if (nums != null && nums.length >= 1) {
            Set<Integer> set = new HashSet<>(nums.length);
            for (int num : nums) {
                if (set.contains(targetSum - num)) {
                    result = true;
                    break;
                }
                set.add(num);
            }
        }

        return result;
    }
}
