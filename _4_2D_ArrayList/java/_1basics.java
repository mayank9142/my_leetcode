package _4_2D_ArrayList.java;

import java.util.ArrayList;

public class _1basics {
    static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr= new ArrayList<>();
        ArrayList<Integer> a= new ArrayList<>();
        a.add(5);
        a.add(5);
        a.add(5);
        a.add(5);
        a.add(5);
        arr.add(a);
        ArrayList<Integer> b= new ArrayList<>();
        b.add(5);
        b.add(5);
        b.add(5);
        b.add(5);
        b.add(5);
        arr.add(b);
        System.out.println(arr);
        //Printing elements
        System.out.println(arr.get(1).get(3));
        //Setting elements
        arr.get(0).set(1,7);
        //Adding elements
        arr.add(new ArrayList<>());
        //Print like 2d array
        for(int i =0;i<arr.size();i++){
            for(int j =0;j<arr.get(i).size();j++){
                System.out.print(arr.get(i).get(j) + " ");
            }
            System.out.println();
        }


        for(ArrayList<Integer> list :arr){
            for(int ele: list){
                System.out.println(ele+" ");
            }
            System.out.println();
        }
    }
}
