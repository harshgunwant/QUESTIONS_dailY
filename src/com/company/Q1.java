package com.company;

public class Q1 {
    public static void main(String[] args) {
        int[] arr={10,-5,-2,4,0,3};
        int k=3;
        System.out.println(MaxFind(arr,k));
    }
    static int MaxFind(int[] nums, int k){
        int sum=Integer.MIN_VALUE;
        int v=0;
        int z=0;
        for(int i=0;i<nums.length-z;i=v){
            z=k;
            while(z>=1){
                if(nums[i]+nums[i+k]>=sum){
                    sum=nums[i]+nums[i+k];
                    v=k;
                }
                z--;
            }
        }
        return sum;
    }
}
