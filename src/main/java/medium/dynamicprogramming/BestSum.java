package medium.dynamicprogramming;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BestSum {

    public List<Integer> bestSum(int targetSum, int[] nums)
    {
        Map<Integer, List<Integer>> map = new HashMap<>();

        return bestSum(targetSum, nums, map);

    }

    public List<Integer> bestSum(int targetSum, int[] nums, Map<Integer, List<Integer>> map)
    {
        if(map.containsKey(targetSum)) return map.get(targetSum);
        if(targetSum == 0) return new ArrayList<>();
        if(targetSum < 0) return null;

        List<Integer> targetSumList = null;

        for(int num: nums) {

            int remainderSum = targetSum - num;
            List<Integer> remainderSumList = bestSum(remainderSum, nums, map);

            if(remainderSumList != null) {
                if (targetSumList == null || targetSumList.size() > remainderSumList.size())  {
                    targetSumList = new ArrayList<>();
                    targetSumList.addAll(remainderSumList);
                    targetSumList.add(num);
                }
            }
        }

        map.put(targetSum, targetSumList);
        return targetSumList;
    }
}
