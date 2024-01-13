package org.vamsi;

import java.util.Arrays;

public class ReverseWords {

    public void reverseWordsInString(String str){
        String[] words= str.split("\\s+");

        System.out.println("Bef: "+ str);
        int i = words.length-1;

        String res ="";
        while(i >= 0){
           res = res + words[i]+ " ";
           i--;
        }

        System.out.println("Rev: " + res.trim());

    }
}
