package org.vamsi;

import java.util.StringTokenizer;

public class WordCount {

    public void getWordCount(String str){

        try{
            //using string tokenizing method
            StringTokenizer tokenizer = new StringTokenizer(str);
            System.out.println("Words: "+tokenizer.countTokens());

            //using split() method
            String[] arr = str.split("\\s+");
            System.out.println(arr.length);

        }catch (NullPointerException e){
            System.out.println("Provide a valid string");
        }

    }

}
