package _1Arrays;

import java.util.Scanner;

public class _5Reverse_array {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the array");
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The array is :");
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        int i =0,j=n-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println("\nThe reversed array is :");
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
//using for loop
//for(int i=0;i<n/2;i++){
//    int temp=arr[i];
//    arr[i]=arr[n-1-i];
//    arr[n-1-i]=temp;
//        }