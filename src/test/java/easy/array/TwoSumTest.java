package easy.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    public void twoSumTest()
    {
        TwoSum twoSum = new TwoSum();
        int[] arr = new int[]{2,3,4,5,6,7,10};

        Assertions.assertTrue(twoSum.twoSum(arr, 13));
    }
}