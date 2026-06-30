package _1Arrays;
import java.util.Scanner;
public class _1Negative_no_in_array {
    public static void main(String[] args) {
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
        System.out.println();
        System.out.println("Negative elements of the arrays are:");
        for(int i =0;i<n;i++){
            if(arr[i]<0){
                System.out.println(arr[i]);
            }
        }

    }
}