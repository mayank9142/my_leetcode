package _1Arrays;

import java.util.Scanner;

public class _4Two_sum_nonopti {
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
        System.out.println("\nEnter the target sum: ");
        int target=sc.nextInt();
        int found =0;
        for(int i=0;i<n;i++){
            for(int j =0;j<n;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("A pair exists as " +arr[i] +" and "+arr[j]+ " at index "+ i+" of first array and index "+j+" of second array ");
                    found++;
                }
            }
        }
        if(found==0){
            System.out.println("No such pair found");
        }
    }
}
