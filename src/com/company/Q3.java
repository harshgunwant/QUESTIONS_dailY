package com.company;

import java.util.ArrayList;
import java.util.List;

public class Q3 {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> items=new ArrayList<>();
        //items=[["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]];
        String ruleKey = "color";
        String ruleValue = "silver";
        //System.out.println(countMatches(items, rules, value));
    }

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        //python we can have dictionary

        int count=0;
        for(int row=0;row<items.size();row++){
            if(ruleKey=="type"){
                if(items.get(row).get(0).equals(ruleValue)) count++;
            }
            else if(ruleKey=="color"){
                if(items.get(row).get(0).equals(ruleValue)) count++;
            }
            else{
                if(items.get(row).get(0).equals(ruleValue)) count++;
            }
        }

        return count;
    }
}

