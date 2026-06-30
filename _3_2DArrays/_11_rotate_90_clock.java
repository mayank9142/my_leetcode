package _3_2DArrays;

public class _11_rotate_90_clock {
    class Solution {
        public void rotate(int[][] matrix) {
            transpose(matrix);
            reverse_row(matrix);
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
            for(int i =0;i<arr.length;i++){

                int stCol=0,endCol=arr[0].length-1;
                while(stCol<endCol){
                    int temp =arr[i][stCol];
                    arr[i][stCol]=arr[i][endCol];
                    arr[i][endCol]=temp;
                    stCol++;
                    endCol--;


                }
            }
        }
    }
}
