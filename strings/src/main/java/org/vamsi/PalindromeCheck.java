package org.vamsi;

public class PalindromeCheck {

    public void simpleCheck(String str){

        //Eg: mom, pop, papa
        int i =0;
        int j = str.length()-1;

        boolean isPalindrome = true;
        while(i <= j){

            char a = str.charAt(i);
            char b = str.charAt(j);

            if(a !=b){
                isPalindrome = false;
                break;
            }

            i++;
            j--;
        }

        System.out.println( isPalindrome ? "Palindrome" : "Not Palindrome");
    }

    public boolean isValidChar(char a){
        return (a>=97 && a <=122) || (a>=48 && a<=57);
    }

    public void complexCheck(String str){

        // Eg: "A man, a plan, a canal: Panama", allow alphanumeric chars, leetcode -125
        String sentence = str.toLowerCase().trim();

        int i=0;
        int j = sentence.length()-1;
        boolean isBoolean = true;

        while(i < j){

            char a = sentence.charAt(i);
            char b = sentence.charAt(j);

            while(!isValidChar(a) && i<j){
                i++;
                a = sentence.charAt(i);
            }

            while (!isValidChar(b) && j>i){
                j--;
                b = sentence.charAt(j);
            }

            if( a != b){
                isBoolean = false;
                break;
            }

            i++;
            j--;
        }


        System.out.println(isBoolean ? "Yes, Palindrome!!" : "Not a Palindrome");
    }

}
