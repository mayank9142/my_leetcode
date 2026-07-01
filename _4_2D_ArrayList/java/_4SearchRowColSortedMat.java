package _4_2D_ArrayList.java;

public class _4SearchRowColSortedMat {
    class Solution {
        public boolean searchMatrix(int[][] arr, int target) {
            int m = arr.length;
            int n =arr[0].length;
            int i =0;
            int j =n-1;
            while(i<m && j>=0){
                if(arr[i][j]>target) j--;
                else if (arr[i][j]<target) i++;
                else return true;
            }
            return false;
        }
    }
}
