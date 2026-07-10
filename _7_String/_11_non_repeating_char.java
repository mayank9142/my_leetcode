package _7_String;

public class _11_non_repeating_char {
    static void main(String[] args) {
        class Solution {
            public char nonRepeatingChar(String s) {
                // code here
                char[] arr= s.toCharArray();
                int n =arr.length-1;
                for(int i=0;i<arr.length;i++){
                    int count=0;
                    for(int j =0;j<arr.length;j++){

                        if(arr[i]!=arr[j]) count++;
                    }
                    if(count==n) return arr[i];
                }
                char ans='$';
                return ans;
            }
        }

    }
}
