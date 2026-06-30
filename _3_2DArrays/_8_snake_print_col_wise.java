package _3_2DArrays;

public interface _8_snake_print_col_wise {
    static void main(String[] args) {
        int [][] arr= {{1,2,3},{1,5,3},{1,2,8}};
        System.out.println("Normal row wise printing: ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Columns wise snake printing ");
        for(int j =0;j<arr[0].length;j++){
            if(j%2==0){
                for(int i =0;i<arr.length;i++){
                    System.out.print(arr[i][j]+" ");
            }
            }
            else{
                for(int i =arr.length-1;i>=0;i--){
                    System.out.print(arr[i][j]+ " ");
                }
            }
            System.out.println();
        }
    }
}
