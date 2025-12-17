package Recursion;

import java.util.*;

public class SubsetswithoutDup {
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        Map<List<Integer>, Integer> map=new HashMap<>();
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>result=new ArrayList<>();
        List<List<Integer>>ans1=new ArrayList<>();
        solve(0,result,nums,ans);
        for(List<Integer> num:ans){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        for(List<Integer> num: map.keySet()) {
            if (map.get(num) == 1) {
                ans1.add(num);
            }
        }
        return ans1;
    }

    public static void solve(int idx,List<Integer>result,int[]nums,List<List<Integer>>ans){

        if(idx==nums.length){
            ans.add(new ArrayList<>(result));
            return ;
        }


        //Pick the element
        result.add(nums[idx]);
        solve(idx+1,result,nums,ans);

        //Bactrack it
        result.remove(result.size()-1);

        //Don't pick the element
        solve(idx+1,result,nums,ans);
    }

    public static void main(String[] args) {
        int[]arr={1,2,2};
        List<List<Integer>> result = subsetsWithDup(arr);
        System.out.println(result);
    }

}
