package _3_2DArrays;

public class _5_print_col_wise {
    static void main(String[] args) {
        int [][] arr= {{1,2,3},{1,5,3},{1,2,8}};
        System.out.println("Normal row wise printing: ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Col wise printing: ");
        for(int i=0;i<arr[0].length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}
