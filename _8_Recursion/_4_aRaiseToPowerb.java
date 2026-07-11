package _8_Recursion;
import java.util.Scanner;
public class _4_aRaiseToPowerb {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base:" );
        int base= sc.nextInt();
        System.out.println("Enter the power:");
        int power = sc.nextInt();
        System.out.println("I am printed with O(n)tc\n"+pow(base,power));
        System.out.println("I am printed with O(logn)tc\n"+pow2(base,power));
    }
    public static int pow(int a,int b){
        if(b==0) return 1; //TC= o(n)
        return a=a*pow(a,b-1);
    }
    public static int pow2(int a,int b){
        if(b==0) return 1; //TC= o(logn)
        if(b%2==0) return pow(a,b/2)*pow(a,b/2);
        else return pow(a,b/2)*pow(a,b/2) *a;
    }

}
