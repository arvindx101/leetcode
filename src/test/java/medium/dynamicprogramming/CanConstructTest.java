package medium.dynamicprogramming;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CanConstructTest {

    @Test
    void canConstruct() {

        Assertions.assertEquals(true,
                new CanConstruct().canConstruct("abcdef",
                        new String[]{"ab", "abc", "cd", "def", "abcd"}));

        Assertions.assertEquals(false,
                new CanConstruct().canConstruct("skateboard",
                        new String[]{"bo", "rd", "ate", "t", "ska", "sk", "boar"}));

        Assertions.assertEquals(true,
                new CanConstruct().canConstruct("enterapotentpot",
                        new String[]{"a", "p", "ent", "enter", "ot", "o", "t"}));

        Assertions.assertEquals(false,
                new CanConstruct().canConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef",
                        new String[]{"e", "ee", "eee", "eeee", "eeeee", "eeeeee"}));

    }
}