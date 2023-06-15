//https://www.codingninjas.com/codestudio/problems/pair-sum_8230699?challengeSlug=striver-sde-challenge&leftPanelTab=0

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class PairSum{

    public static List<int[]> pairSum(int[] arr, int s) {
        // Write your code here.

        HashMap<Integer,Integer> map = new HashMap<>();
        List<int[]> list = new ArrayList<>();

        for( int num : arr){
            int rem = s - num;

            if(map.containsKey(rem)){
                for( int i = 0; i < map.get(rem); i++){
                    list.add(new int[]{Math.min(num,rem),Math.max(num,rem)});
                }
            }

            map.put(num,map.getOrDefault(num,0)+1);
        }


        //To satisfy the seconf note!, this has to been done
        Collections.sort(list, new Comparator<int[]>(){
            @Override
            public int compare(int[] x, int[] y){
                if(x[0]==y[1]){
                    return x[1] - y[1];
                }else{
                    return x[0] - y[0];
                }
            }
        });

        return list;

    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int target=5;

        List<int []> ans=pairSum(arr, target);
        for(int[] a: ans){
            System.out.println(Arrays.toString(a));
        }
    }
}