package _5Sorting;

public class _1checkIfarrayIsSorted {
    static void main(String[] args) {
        int[] arr = {12, 23, 34, 45, 56, 67, 78};
        System.out.println(sortedOrNot(arr));
    }


    public static boolean sortedOrNot(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) return false;
        }
        return true;
    }
}