package _8_Recursion;

public class _5_reverse_of_number {
    static void main(String[] args) {
        //normal way
        int n =3242;
        int r=0;
        System.out.println(reverse(n,r));
//        while(n!=0){
//            r*=10;
//            r+=(n%10);
//            n/=10;
//        }
//        System.out.println(r);
        //recursive


    }
    public static int reverse(int n,int r){
        if(n==0) return r;
        return  reverse(n/10,r*10+n%10);
    }
}
