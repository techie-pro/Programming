package com.techiepro.strings;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {
        String str = "Yuvakishore";
        int length = str.length();
        StringBuilder revered = new StringBuilder(str).reverse();
        System.out.println(revered);
        char[] ch = str.toCharArray();
        System.out.println(length);
        int count =0;
        for(int i = 0,j = length-1 ; i < length/2 ; i++,j-- )
        {
           if(i<j){
               char temp = ch[i];
               ch[i] = ch[j];
               ch[j] = temp;

           }
            count++;
        }
        System.out.println("count :"+count);
        String result = Arrays.toString(ch);
        System.out.println(result.toString());
        if(result.equals(revered.toString())){
            System.out.println("String reversed as expected : "+result);
        }
    }
}
