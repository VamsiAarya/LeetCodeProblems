package org.vamsi;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedChar {

    public void getCharNonRepeated(String str){

        if(str == null || str.isEmpty()){
            System.out.println("Provide a valid string");
            System.exit(1);
        }

        Map<Character, Integer> mapCount = new LinkedHashMap<>();
        for (Character c: str.toCharArray()) {
            mapCount.put(c, mapCount.getOrDefault(c, 0)+1);
        }

        for(Character key : mapCount.keySet()){
            if(mapCount.get(key) ==1){
                System.out.println("First non repeating character is: "+ key);
                break;
            }
        }
    }
}
