package _8_Recursion;

public class _6_sum1_toN {
    static void main(String[] args) {
        int n =10;
        System.out.println(findSum(n));
    }
    public static int findSum(int n ){
        if(n==1) return n;
        return n+ findSum(n-1);
    }
}
