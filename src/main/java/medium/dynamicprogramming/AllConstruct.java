package medium.dynamicprogramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AllConstruct {

    public List<List<String>> allConstruct(String target, String[] wordbank) {

        Map<String, List<List<String>>> memo = new HashMap<>();
        return allConstruct(target, wordbank, memo);
    }

    public List<List<String>> allConstruct(String target, String[] wordbank, Map<String, List<List<String>>> memo) {

        if(memo.containsKey(target)) return memo.get(target);

        List<List<String>> retVal = new ArrayList<List<String>>();

        if(target.equals("")) {
            retVal.add(new ArrayList<>());
            return retVal;
        }

        for(String word: wordbank) {
            if(target.indexOf(word) == 0) {
                String suffix = target.substring(word.length());
                List<List<String>> suffixListString = allConstruct(suffix, wordbank, memo);

                for(List<String> ls: suffixListString) {
                    List<String> targetListSting = new ArrayList<>();
                    targetListSting.add(word);
                    targetListSting.addAll(ls);
                    retVal.add(targetListSting);
                }
            }
        }

        memo.put(target, retVal);
        return retVal;
    }
}
