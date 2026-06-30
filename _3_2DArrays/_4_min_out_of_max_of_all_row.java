package _3_2DArrays;

import java.util.ArrayList;

public class _4_min_out_of_max_of_all_row {
    static void main(String[] args) {
        int min = Integer.MAX_VALUE;

        int [][] arr= {{1,2,3},{1,5,3},{1,2,8}};
        ArrayList<Integer> ans= new ArrayList<>();
        for(int i =0;i<arr.length;i++){
            int max = Integer.MIN_VALUE;
            for(int j =0;j<arr[0].length;j++){
                if(arr[i][j]>max) max = arr[i][j];
            }
            ans.add(max);
        }
        System.out.println(ans);
        for(int i =0;i<ans.size();i++){
            if(ans.get(i)<min) min =ans.get(i);

        }
        System.out.println("Minm element out of max of all rows is "+min);
    }
}
