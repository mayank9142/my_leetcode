package _6Binary_Search;

public class _10_search_sorted_matrix {
    class Solution {
        public boolean searchMatrix(int[][] arr, int tar) {
            // int m = arr.length;
            // int n =arr[0].length;
            // int i =0;
            // int j =n-1;
            // while(i<m && j>=0){
            //     if(arr[i][j]>target) j--;
            //     else if (arr[i][j]<target) i++;
            //     else return true;
            // }
            // return false;
            // int row= arr.length;
            // int col=arr[0].length;
            // int totval=row*col;
            // int[] space = new int[totval];
            // int idx=0;
            // for(int i =0;i<row;i++){
            //     for(int j=0;j<col;j++){
            //         space[idx]=arr[i][j];
            //         idx++;

            //     }
            // }
            // int lo=0,hi=totval-1;
            // while(lo<=hi){
            //     int mid =(lo+hi)/2;
            //     if(space[mid]==tar) return true;
            //     else if(space[mid]<tar) lo=mid+1;
            //     else hi =mid-1;
            // }
            // return false;
            int rows=arr.length;
            int cols=arr[0].length;
            int lo=0;
            int hi=rows*cols-1;
            while(lo<=hi){
                int mid =(lo+hi)/2;
                int midRow= mid/cols;
                int midCol= mid%cols;
                if(arr[midRow][midCol]==tar) return true;
                else if(arr[midRow][midCol]>tar) hi=mid-1;
                else{
                    lo=mid+1;
                }
            }
            return false;
        }
    }
}
