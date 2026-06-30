package _1Arrays;

import java.util.Scanner;

public class _2Largest_in_array {
   public static void main (String[] args) {
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the array");
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The array is ");
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");;
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max) max=arr[i];
        }
       System.out.println();
       System.out.println("The largest element is ");
        System.out.println(max);
    }
}
