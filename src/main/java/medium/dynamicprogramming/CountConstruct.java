package medium.dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

public class CountConstruct {

    public int countConstruct(String target, String[] wordbank) {
        Map<String, Integer> memo = new HashMap<>();
        return countConstruct(target, wordbank, memo);
    }

    public int countConstruct(String target, String[] wordbank, Map<String, Integer> memo) {

        if(memo.containsKey(target)) return memo.get(target);
        if(target.equals("")) return 1;
        int retVal = 0;

        for(String word:wordbank) {
            if(target.indexOf(word) == 0) {
                retVal += countConstruct(target.substring(word.length()), wordbank, memo);
            }
        }

        memo.put(target, retVal);
        return retVal;
    }

}
