package com.techiepro.strings;


import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        String str = "spar";
        String str2 = "raSp";

        char[] st = str.toLowerCase().toCharArray();
        char[] st2 = str2.toLowerCase().toCharArray();

        Arrays.sort(st);
        Arrays.sort(st2);
//        System.out.print( Arrays.toString(st)+"\n"+Arrays.toString(st2));
        if(Arrays.equals(st, st2))
            System.out.print("Both are anagrams"+ Arrays.toString(st)+"\n"+Arrays.toString(st2));
        else
            System.out.println("Not anagrams");
    }
}
