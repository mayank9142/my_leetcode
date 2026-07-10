package _8_Recursion;

public class _2_1toN {
//    static void main(String[] args) {
//        int n =10;
//        print(1,n);
//    }
//    public static void print(int x,int n){
//        if(x>n) return;
//        System.out.println(x);
//        print(x+1,n);

        //callbackmethod
        static void main(String[] args) {
            print(10);
        }
    public static void print(int n){
        if(n==0) return;
        print(n-1);
        System.out.println(n+" ");
    }
}
