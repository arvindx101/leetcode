/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]


Constraints:

2 <= nums.length <= 10^4
-10^9 <= nums[i] <= 10^9
-10^9 <= target <= 10^9
Only one valid answer exists.


Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
*/

package easy.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TwoSum {

    public int[] twoSum(int[] nums, int targetSum) {
        int[] arr = new int[2];
        if (nums != null && nums.length >= 1) {

            Map<Integer, Integer> map = new HashMap<>(nums.length);

            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(targetSum - nums[i])) {
                    arr[0] = map.get(targetSum - nums[i]);
                    arr[1] = i;
                    break;
                }
                map.put(nums[i], i);
            }
        }

        return arr;
    }
}
