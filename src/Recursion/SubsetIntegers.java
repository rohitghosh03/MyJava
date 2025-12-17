package Recursion;
import java.util.*;

public class SubsetIntegers {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>result=new ArrayList<>();
        solve(0,result,nums,ans);

    return ans;
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
        int[]arr={1,2,3};
        List<List<Integer>> result = subsets(arr);
        System.out.println(result);
    }



}
