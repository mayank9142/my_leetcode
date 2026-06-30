package _3_2DArrays;

public class _6_print_snake_pattern {
    static void main(String[] args) {
        int [][] arr= {{1,2,3},{1,5,3},{1,2,8}};
        System.out.println("Normal row wise printing: ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Snake pattern printing: ");
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                for(int j=0;j<arr[0].length;j++){
                    System.out.print(arr[i][j]);
                }
            }
            else{
                for(int j =arr[0].length-1;j>=0;j--){
                    System.out.print(arr[i][j]);

                }
            }
            System.out.println();
        }
    }
}
