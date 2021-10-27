package medium.dynamicprogramming;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountConstructTest {

    @Test
    void countConstruct() {

        Assertions.assertEquals(2,
                new CountConstruct().countConstruct("purple",
                        new String[]{"purp", "p", "ur", "le", "purpl"}));

        Assertions.assertEquals(1,
                new CountConstruct().countConstruct("abcdef",
                        new String[]{"ab", "abc", "cd", "def", "abcd"}));

        Assertions.assertEquals(0,
                new CountConstruct().countConstruct("skateboard",
                        new String[]{"bo", "rd", "ate", "t", "ska", "sk", "boar"}));

        Assertions.assertEquals(4,
                new CountConstruct().countConstruct("enterapotentpot",
                        new String[]{"a", "p", "ent", "enter", "ot", "o", "t"}));

        Assertions.assertEquals(0,
                new CountConstruct().countConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeef",
                        new String[]{"e", "ee", "eee", "eeee", "eeeee", "eeeeee"}));
    }
}