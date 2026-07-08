package _7_String;
//Given a string s, the task is to change the complete string to
// uppercase or lowercase depending on the case of the first character.
public class _4_change_string {
    static void main(String[] args) {
        class Solution {
            String modify(String s) {
                if((int)(s.charAt(0))<=90){
                    s=s.toUpperCase();

                }
                else s=s.toLowerCase();
                return s;
            }

        }
    }
}
