package _3_2DArrays;

public class _3_row_with_max_ele {
    static void main(String[] args) {
        int [][] arr= {{1,2,3},{1,5,3},{1,2,8}};
        int max = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){

            for (int j=0;j<arr[0].length;j++){
                if(arr[i][j]>max) max = arr[i][j];
            }
        }
        System.out.println("The max ele is "+max);
    }
}
