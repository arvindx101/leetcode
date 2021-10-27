package medium.dynamicprogramming;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CanSumTest {

    @Test
    void canSum() {

        Assertions.assertTrue(new CanSum().canSum(7, new int[]{2,3}));
        Assertions.assertTrue(new CanSum().canSum(7, new int[]{5,3,4,7}));
        Assertions.assertFalse(new CanSum().canSum(7, new int[]{2,4}));
        Assertions.assertTrue(new CanSum().canSum(8, new int[]{2,3,5}));
        Assertions.assertFalse(new CanSum().canSum(3000, new int[]{7,14}));
    }
}