package medium.dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

public class CanConstruct {

    public boolean canConstruct(String target, String[] wordbank) {

        Map<String, Boolean> memo = new HashMap<>();
        return canConstruct(target, wordbank, memo);
    }

    public boolean canConstruct(String target, String[] wordbank, Map<String, Boolean> memo)  {

        if(memo.containsKey(target)) return memo.get(target);
        if(target.equals("")) return true;

        boolean retVal = false;

        for(String word:wordbank) {
            if(target.indexOf(word) == 0) {
                //word is at prefix of target
                String suffix = target.substring(word.length());
                retVal = canConstruct(suffix, wordbank, memo);
                if (retVal == true)
                    break;
            }
        }

        memo.put(target, retVal);
        return retVal;
    }
}
