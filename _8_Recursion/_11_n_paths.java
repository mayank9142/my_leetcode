package _8_Recursion;

public class _11_n_paths {
    static void main(String[] args) {
        System.out.println(paths(8,5));
    }
    public static int paths(int m, int n ){
        if(m==1||n==1) return 1;
        return paths(m-1,n)+paths(m,n-1);
    }
}
