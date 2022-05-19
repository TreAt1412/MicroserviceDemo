package com.example.moviecatalogservice;

import java.util.HashSet;

public class test {

    public static int threeSumClosest(int[] nums, int target) {
        int flag= Integer.MAX_VALUE;
        for (int i =0;i<nums.length-2;i++){
            for (int j =i+1; j< nums.length-1;j++){
                for (int k=j+1;k<nums.length;k++){
                    System.out.println(Math.abs(nums[i] + nums[j] + nums[k] - target));
                    System.out.println(Math.abs(target-flag));
                    System.out.println(target-flag);
                    if(Math.abs(nums[i] + nums[j] + nums[k] - target) < Math.abs(target-flag)){
                        flag = nums[i] + nums[j] + nums[k];
                    }
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) {
//        int[] a={1,1,-1,-1,2};
//        System.out.println(threeSumClosest(a, -1));
        System.out.println(Math.abs(-1-Integer.MAX_VALUE));

    }
}
