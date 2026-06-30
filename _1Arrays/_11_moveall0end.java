package _1Arrays;
import java.util.*;
public class _11_moveall0end {
    class Solution {
        void pushZerosToEnd(int[] arr) {

            ArrayList<Integer> ans= new ArrayList<>();
            for(int i=0;i<arr.length;i++){
                if(arr[i]!=0) ans.add(arr[i]);
            }
            for(int i=0;i<arr.length;i++){
                if(arr[i]==0) ans.add(arr[i]);
            }

            for(int i =0;i<arr.length;i++){
                arr[i]=ans.get(i);
            }
            // for(int i =0;i<arr.length-1;i++){
            //     for(int j =0;j<arr.length-1-i;j++){
            //         if(arr[j]==0){
            //             int temp=arr[j];
            //             arr[j]=arr[j+1];
            //             arr[j+1]=temp;
            //         }
            //     }
            // }TLE
        }
    }
}
