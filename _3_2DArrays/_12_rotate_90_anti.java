package _3_2DArrays;

public class _12_rotate_90_anti {
    class Solution {
        public void rotateMatrix(int[][] mat) {
            transpose(mat);
            reverse_row(mat);
        }
        public void transpose(int[][] arr){
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<i;j++){
                    int temp=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                }
            }
        }
        public void reverse_row(int[][] arr){
            for(int i =0;i<arr[0].length;i++){

                int stRow=0,endRow=arr.length-1;
                while(stRow<endRow){
                    int temp =arr[i][stRow];
                    arr[stRow][i]=arr[endRow][i];
                    arr[endRow][i]=temp;
                    stRow++;
                    endRow--;


                }
            }
        }
    }
}
