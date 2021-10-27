package medium.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
/*
Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Example 2:

Input: nums = [0,0,0,0]
Output: [0,0,0]
 */
class ThreeSumTest {

    @Test
    void threeSum() {

        int nums1[];
        List<List<Integer>> lli;
        ThreeSum threeSum = new ThreeSum();


        nums1 = new int[]{-1,0,1,2,-1,-4};
        lli = new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(-1,-1,2)),
                new ArrayList<>(Arrays.asList(-1,0,1))));
        Assertions.assertEquals(lli, threeSum.threeSum(nums1));

        nums1 = new int[]{0,0,0,0};
        lli = new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(0,0,0))));
        Assertions.assertEquals(lli, threeSum.threeSum(nums1));

    }
}