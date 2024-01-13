package org.vamsi;

import java.util.Arrays;
import java.util.HashMap;

public class AnagramStrings {

    public boolean method1(String strA, String strB){

        if(strA.length() != strB.length()){
            return false;
        }

        HashMap<Character, Integer> strAMap = new HashMap<>();
        HashMap<Character, Integer> strBMap = new HashMap<>();

        for (Character c : strA.toCharArray()) {
            strAMap.put(c, strAMap.getOrDefault(c, 0)+1);
        }

        for (Character c: strB.toCharArray()) {
            strBMap.put(c, strBMap.getOrDefault(c,0)+1);
        }

        boolean isSame = true;

        for(Character key : strAMap.keySet()){
            if(!strBMap.containsKey(key)){
                isSame = false;
                break;
            }else{
                if(strAMap.get(key) != strBMap.get(key)){
                    isSame = false;
                    break;
                }
            }
        }

        return isSame;
    }

    public boolean method2(String strA, String strB){

        char[] charA = strA.toCharArray();
        char[] charB = strB.toCharArray();

        Arrays.sort(charA);
        Arrays.sort(charB);

        return  Arrays.equals(charA, charB);
    }
    public void checkAnagrams(String strA, String strB){

        //using hashmaps
        System.out.println( method1(strA, strB) ? "Anagrams" : "Not Anagrams" );

        System.out.println(method2(strA, strB) ? "Yes Anagrams!" : "Are Not Anagrams!!!");

    }
}
