package org.vamsi;

import java.util.HashMap;
import java.util.Map;

public class RepeatedWordCount {

    // program to find the frequency of the words in a given sentence, sentence is separated by a space character
    public void getCountsOfWords(String sentence){

        if(sentence.isEmpty()){
            System.out.println("provided empty string");
        }
        else {
            HashMap<String, Integer> countMap = new HashMap<>();

            String[] words = sentence.split(" ");

            for(String word : words){
                countMap.put(word, countMap.getOrDefault(word, 0)+1);
            }

            for (String key: countMap.keySet()) {
                System.out.println("Word: "+ key + ", Frequency: "+ countMap.get(key));
            }

            for(Map.Entry<String, Integer> entry : countMap.entrySet()){
                System.out.println(entry.getKey() + "="+ entry.getValue());
            }
        }


    }

}
