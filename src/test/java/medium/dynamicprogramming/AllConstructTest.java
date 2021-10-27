package medium.dynamicprogramming;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AllConstructTest {

    @Test
    void allConstruct() {

        List<String> ls1 = new ArrayList<>(Arrays.asList("purp", "le"));
        List<String> ls2 = new ArrayList<>(Arrays.asList("p","ur","p","le"));

        List<List<String>> lls = new ArrayList<>();

        lls.add(ls1);
        lls.add(ls2);

        Assertions.assertEquals(lls,
                new AllConstruct().allConstruct("purple",
                        new String[]{"purp", "p", "ur", "le", "purpl"}));


        lls = new ArrayList<>();

        lls.add(new ArrayList<String>(Arrays.asList("ab", "cd", "ef")));
        lls.add(new ArrayList<String>(Arrays.asList("ab", "c", "def")));
        lls.add(new ArrayList<String>(Arrays.asList("abc", "def")));
        lls.add(new ArrayList<String>(Arrays.asList("abcd", "ef")));

        Assertions.assertEquals(lls,
                new AllConstruct().allConstruct("abcdef",
                        new String[]{"ab", "abc", "cd", "def", "abcd", "ef", "c"}));

        lls = new ArrayList<>();

        Assertions.assertEquals(lls,
                new AllConstruct().allConstruct("skateboard",
                        new String[]{"bo", "rd", "ate", "t", "ska", "sk", "boar"}));

        lls = new ArrayList<>();

        Assertions.assertEquals(lls,
                new AllConstruct().allConstruct("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaz",
                        new String[]{"a", "aa", "aaa", "aaaa", "aaaaa"}));


    }

}