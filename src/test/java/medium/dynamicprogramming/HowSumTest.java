package medium.dynamicprogramming;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HowSumTest {

    @Test
    void howSum() {

        List<Integer> expected;
        int expectedSum;
        HowSum hs = new HowSum();

        expected = hs.howSum(7, new int[]{2,3});
        expectedSum = 0;
        for(int i:expected)
            expectedSum += i;
        Assertions.assertEquals(expectedSum, 7);

        expected = hs.howSum(7, new int[]{5,3,4,7});
        expectedSum = 0;
        for(int i:expected)
            expectedSum += i;
        Assertions.assertEquals(expectedSum, 7);

        expected = hs.howSum(7, new int[]{2,4});
        Assertions.assertEquals(expected,null);

        expected = hs.howSum(8, new int[]{2,3,5});
        expectedSum = 0;
        for(int i:expected)
            expectedSum += i;
        Assertions.assertEquals(expectedSum, 8);

        expected = hs.howSum(500, new int[]{7, 14});
        Assertions.assertEquals(expected,null);


    }
}