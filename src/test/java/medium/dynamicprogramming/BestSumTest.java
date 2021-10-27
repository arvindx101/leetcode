package medium.dynamicprogramming;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BestSumTest {

    @Test
    void bestSum() {

        Assertions.assertEquals(
                new ArrayList<Integer>(Arrays.asList(7)),
                new BestSum().bestSum(7, new int[]{5, 3, 4, 7})
                );
        Assertions.assertEquals(
                new ArrayList<Integer>(Arrays.asList(3,5)),
                new BestSum().bestSum(8, new int[]{2,3,5})
        );
        Assertions.assertEquals(
                new ArrayList<Integer>(Arrays.asList(4,4)),
                new BestSum().bestSum(8, new int[]{1,4,5})
        );
        Assertions.assertEquals(
                new ArrayList<Integer>(Arrays.asList(25,25,25,25)),
                new BestSum().bestSum(100, new int[]{1, 2, 5, 25})
        );
    }
}