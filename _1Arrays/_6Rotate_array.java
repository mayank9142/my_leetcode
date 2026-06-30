package _1Arrays;
import java.util.Scanner;
public class _6Rotate_array {
    static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of k: ");
        int  k= sc.nextInt();
        k%=n;
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
        for(int ele:arr){
            System.out.print(ele+" ");
        }

    }
    public static void reverse(int[]arr,int i ,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
