package medium.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.



Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Example 2:

Input: nums = []
Output: []
Example 3:

Input: nums = [0]
Output: []


Constraints:

0 <= nums.length <= 3000
-10^5 <= nums[i] <= 10^5
 */
public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> lli = new ArrayList();

        for(int i = 0; i < nums.length; i++)
        {
            int target = 0 - nums[i];
            int j = i + 1;
            int k = nums.length - 1;

            while(j < k)
            {
                if(nums[j] + nums[k] == target)
                {
                    List<Integer> li = new ArrayList();
                    li.add(nums[i]);
                    li.add(nums[j]);
                    li.add(nums[k]);
                    lli.add(li);
                    while(j < nums.length && nums[j] == li.get(1)) j++;
                    while(k > 0 && nums[k] == li.get(2)) k--;
                }
                else if(nums[j] + nums[k] > target)
                    k--;
                else
                    j++;

            }

            while(i < nums.length-1 && nums[i+1] == nums[i]) i++;
        }

        return lli;

    }
}