package _2ArrayLists;
import java.util.ArrayList;

public class _1basic {
    static void main(String[] args) {
        ArrayList<Integer>  arr= new ArrayList<>();
        arr.add(18);
        arr.add(07);
        arr.add(45);
        System.out.println(arr.get(2));
        System.out.println(arr);
        int n =arr.size(); //arr.lenght
        arr.add(1,10); //at imdex 1, 10 will get added
        arr.remove(n-1); //last element remove

    }
}
