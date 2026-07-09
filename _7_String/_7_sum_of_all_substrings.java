package _7_String;

public class _7_sum_of_all_substrings {
    class Solution {
        public static int sumSubstrings(String s) {
            int count = 0;

            for(int i = 0; i < s.length(); i++){
                for(int j = i; j < s.length(); j++){
                    String sub = s.substring(i, j + 1);
                    count += Integer.parseInt(sub);
                }
            }

            return count;
        }
    }
}
