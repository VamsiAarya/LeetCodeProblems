package org.vamsi;

import java.util.Arrays;

public class ReverseString {

    public void reverseString(String str){

        // #1: using string buffer
        StringBuffer buffer = new StringBuffer(str);
        String result = buffer.reverse().toString();
        System.out.println( str+" : "+result);

        // #2: without using utility class

        String result2 = "";
        for( int index= str.length()-1; index >=0; index --){
            result2 += str.charAt(index);
        }

        System.out.println( str +" <> "+  result2);

        // #3 : two pointer method
        char[] chars = str.toCharArray();
        int i =0;
        int j = str.length()-1;

        while(i <= j){
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;

            i++;
            j--;
        }

        System.out.println("Method 3: "+ String.valueOf(chars));
    }

}
