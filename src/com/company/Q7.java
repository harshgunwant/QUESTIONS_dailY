package com.company;

public class Q7 {
    public static void main(String[] args) {
        String s1="aabcc";
        String s2="dbbca";
        String s3="aadbbcbcac";
        System.out.println(isInterleave(s1,s2,s3));
    }
    static boolean isInterleave(String s1, String s2, String s3) {
        //edge case
        if((s1.length()==0) && (s2.length()==0) && (s3.length()==0)) return true;

        String[] str=new String[s3.length()];
        if(str.length!=(s1+s2).length()) return false;




        return false;

    }
}
