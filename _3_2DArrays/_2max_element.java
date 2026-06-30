package _3_2DArrays;

import java.util.Scanner;

public class _2max_element {
    public static void main(String[] args) {
        int[][] arr= new int[3][4];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("The array is ");
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int max=Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]>max) max=arr[i][j];
            }
        }
        System.out.println("The max element is "+max);
    }
}
