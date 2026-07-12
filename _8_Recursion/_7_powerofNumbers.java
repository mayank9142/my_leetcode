package _8_Recursion;
//Given a number n, find the value of n raised to the power of its own reverse.
//Note: The result will always fit into a 32-bit signed integer.
public class _7_powerofNumbers {
    class Solution {
        public int reverseExponentiation(int n) {
            // code here
            int v=n;
            int r=0;
            while(n!=0){
                r*=10;
                r+=(n%10);
                n/=10;
            }
            return RecursivePower(v,r);
        }
        static int RecursivePower(int n, int p) {
            // Code here
            if(p==0) return 1;
            if(p%2==0) return RecursivePower(n,p/2)*RecursivePower(n,p/2);
            else return n*RecursivePower(n,p/2)*RecursivePower(n,p/2);
        }
    }

}
