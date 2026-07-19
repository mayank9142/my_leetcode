package _8_Recursion;

import java.util.* ;

public class _15_PowerSet {
    // User function Template for Java

    class Solution {
        public List<String> AllPossibleStrings(String s) {
            // Code here
            List<String> a= new ArrayList<>();
            subsets("",s,0,a);
            Collections.sort(a);
            return a;
        }
        public void subsets(String ans,String s,int idx,List<String> a){
            if(idx==s.length()){
                if(ans.length()!=0) a.add(ans);
                return;
            }
            char ch =s.charAt(idx);
            subsets(ans+ch,s,idx+1,a);//pick
            subsets(ans,s,idx+1,a);//skip
        }
    }
}
