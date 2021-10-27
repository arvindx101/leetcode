package medium.dynamicprogramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class HowSum {


    public List<Integer> howSum(int targetSum, int[] nums) {

        Map<Integer, List<Integer>> map = new HashMap<>();

        return howSum(targetSum, nums, map);

    }
    public List<Integer> howSum(int targetSum, int[] nums, Map<Integer, List<Integer>> map)
    {
        if(map.containsKey(targetSum)) return map.get(targetSum);

        if (targetSum == 0) return new ArrayList<Integer>();
        if (targetSum < 0) return null;

        List<Integer> targetSumList = null;

        for(int num:nums) {

            int remainderSum = targetSum - num;
            List<Integer> remainderSumList = howSum(remainderSum, nums, map);

            if(remainderSumList != null) {

                targetSumList = new ArrayList<Integer>();
                targetSumList.add(num);
                targetSumList.addAll(remainderSumList);
                break;
            }
        }

        map.put(targetSum, targetSumList);
        return targetSumList;
    }
}
