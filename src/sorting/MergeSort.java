package sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[]args){
        int[] rohit={2,3,6,1,5};
        System.out.println(Arrays.toString(mergeSort(rohit)));
    }
    static int[]mergeSort(int[]nums){
        if(nums.length==1){
            return nums;
        }
        int mid=nums.length/2;
        int[]left=mergeSort(Arrays.copyOfRange(nums,0,mid));
        int[]right=mergeSort(Arrays.copyOfRange(nums,mid,nums.length));
        return merge(left,right);
    }
    public static int[] merge(int[]start,int[]end){
        int i=0;
        int j=0;
        int k=0;
        int[]mix=new int[start.length+end.length];
        while(i<start.length&&j< end.length){
            if(start[i]<end[j]){
                mix[k]=start[i];
                i++;
                k++;
            }else{
                mix[k]=end[j];
                k++;
                j++;
            }

        }
        while(i<start.length){
            mix[k]=start[i];
            i++;
            k++;
        }
        while(j<end.length){
            mix[k]=end[j];
            j++;
            k++;
        }

        return mix;
    }
}
