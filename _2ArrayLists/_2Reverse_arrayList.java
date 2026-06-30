package _2ArrayLists;
import java.util.*;
public class _2Reverse_arrayList {
    static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();
        for(int i=0;i<10;i++){
            arr.add(i);
        }
        System.out.println(arr);
        int st=0;
        int en=arr.size()-1;
        while(st<en){
            int temp=arr.get(st);
            arr.set(st,arr.get(en));
            arr.set(en,temp);
            st++;
            en--;
        }
        System.out.println(arr);
    }

}
