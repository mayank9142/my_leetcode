package _7_String;

public class _2_palindrome_string {
    class Solution {
        boolean isPalindrome(String s) {
            // code here
            int i=0,j=s.length()-1;
            while(i<=j){
                if(s.charAt(i)==s.charAt(j)){
                    i++;
                    j--;
                    continue;

                }
                else return false;
            }

            return true;
        }
    }
}
