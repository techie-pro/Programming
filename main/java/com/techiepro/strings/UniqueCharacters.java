package com.techiepro.strings;

import java.util.Arrays;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = " yuva";
        String s = str.trim();
        char[] ch = s.toCharArray();

        Arrays.sort(ch);
        System.out.println(Arrays.toString(ch));
        for (int i = 0; i < ch.length-1;i++)
        {
            System.out.println(i+" "+ch[i]+" -- "+ch[i+1]);
            if(ch[i] == ch[i+1]) {

                System.out.println("String has duplicates");
                System.exit(0);
            }
        }
        System.out.println("String has unique characters");
    }
}
