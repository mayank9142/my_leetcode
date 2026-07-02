package _5Sorting;

public class _2BubbleSort {
    class Solution {
        public void bubbleSort(int[] arr) {
            int n =arr.length-1;
            for(int i=0;i<n;i++){
                int swaps=0;
                for(int j =0;j<n-i;j++){
                    if(arr[j]>arr[j+1]){
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                        swaps++;
                    }
                }
                if(swaps==0) break;
            }
        }
    }
}
