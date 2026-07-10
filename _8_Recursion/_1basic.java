package _8_Recursion;

public class _1basic {
    static int n=0;// static variable decalred outise psvm hence accessible and updatable everywhere
    static void main(String[] args) {
        mayank();
    }
    public static void mayank(){
        if(n==10) return;
        System.out.println("Mayank");
        n++;
        mayank();

    }
}
