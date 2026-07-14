package _8_Recursion;

public class _12_printElementInArray {
    static void main(String[] args) {
        int[] arr={32,654,63,73,61};
        recprint(arr,0);
    }
    public static void recprint(int[] arr, int idx){
//        if(idx==arr.length) return;
//        System.out.print(arr[idx]+" ");
//        recprint(arr,idx+1);//forward print
        if(idx==arr.length) return;
        recprint(arr,idx+1);//backward print
        System.out.print(arr[idx]+" ");

    }
}
