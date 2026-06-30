package _1Arrays;

public class _10merge2sortedarrays {
    class Solution {
        public void merge(int[] arr1, int m, int[] arr2, int n) {
            int[] ans = new int[m+n];
            int i =0,j=0,k=0;
            while(i<arr1.length&&j<arr2.length){
                if(arr1[i]<arr2[j]){
                    ans[k]=arr1[i];
                    i++;
                    k++;
                }
                else{
                    ans[k]=arr2[j];
                    j++;
                    k++;
                }
            }
            for(i=0;i<m+n;i++){
                arr1[i]=ans[i];
            }
        }

    }
}
