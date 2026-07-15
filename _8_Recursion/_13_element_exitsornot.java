package _8_Recursion;

public class _13_element_exitsornot {
    static void main(String[] args) {
        int[] arr={32,54,76,23,94};
        System.out.println(recExists(arr,54,0));
    }
    public static boolean recExists(int[] arr,int ele,int idx){
        if(idx==arr.length) return false;
        if(arr[idx]==ele) return true;
        return recExists(arr,ele,idx+1);

    }
}
