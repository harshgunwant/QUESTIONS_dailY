package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr={0,3,7,2,5,8,4,6,0,1};
        System.out.println(SEQ(arr));
	// write your code here
    }
    static int SEQ(int[] arr1){
        ArrayList<Integer> arr=new ArrayList<>();

        if(arr1.length==0 || arr1.length==1) return arr1.length;
        Arrays.sort(arr1);
        int c=0;
        for(int i=0;i<arr1.length-1;i++){
            if(arr1[i+1]==(arr1[i]+1)) c++;
            else{
                c=0;
            }
            arr.add(c);
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i< arr.size();i++){
            if(arr.get(i)>max) max=arr.get(i);
        }
        return max+1;

    }
}
