package easy.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    public void twoSumTest()
    {
        TwoSum twoSum = new TwoSum();
        int[] arr = new int[]{2,3,4,5,6,-8,10};
        int[] ret = new int[]{1,6};

        Assertions.assertArrayEquals(ret, twoSum.twoSum(arr, 13));

    }
}