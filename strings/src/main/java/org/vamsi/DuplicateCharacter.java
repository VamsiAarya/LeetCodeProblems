package org.vamsi;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacter {

    public Character getDuplicateChar(String str){

        Map<Character, Integer> charCountMap = new HashMap<>();

        for(Character c : str.toCharArray()){
            charCountMap.put(c, charCountMap.getOrDefault(c,0)+1);
        }

        for(Character key : charCountMap.keySet()){
            if (charCountMap.get(key) > 1){
                return key;
            }
        }

        return null;
    }

}
