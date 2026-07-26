package _8_Recursion;

public class _17_TowerofHanoi {
    static void main(String[] args) {
        hanoi(4,'A','B','C');
    }

    public static void hanoi(int n, char a, char b, char c) {
        if(n==0) return;
        hanoi(n-1,a,c,b);//n-1 disks from A to b via C;
        System.out.println(a+"-->"+c);//largest form A to C;
        hanoi(n-1,b,a,c);//n-1 dsik form B to c via A;

    }
}
