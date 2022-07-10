package com.company;

public class Q4 {
    public static void main(String[] args) {
        String s="is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }
    static String sortSentence(String s) {
        //Get all words
        String[] words = s.split(" ");
        String[] orderedWords = new String[words.length];

        for (String w: words) {
            //Get the last digit and subtract 1 for 0-indexing
            int index = (w.charAt(w.length() - 1) - '0') - 1;
            orderedWords[index] = w.substring(0, w.length() - 1);
        }

        //For efficient manipulation
        StringBuilder sb = new StringBuilder();

        for (String w: orderedWords) {
            sb.append(w + " ");
        }
        //Remove extra space added in the last word
        return sb.toString().trim();
    }
}
