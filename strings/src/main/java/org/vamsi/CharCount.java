package org.vamsi;

public class CharCount {

    public void getCharCount(String str, char ch){

        // approach 1
        try {

            int count = 0;
            for (Character c : str.toCharArray() ) {
                if(c == ch)
                    count++;
            }

            System.out.println("Count of char: "+ ch +" is "+ count);
        }catch (NullPointerException e){
            System.out.println("Provide a valid string");
        }

        // approach 2

        int result = str.length() - str.replaceAll(ch+"", "").length();
        System.out.println("Result: "+ result);
    }


}
