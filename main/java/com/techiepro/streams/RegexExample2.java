package com.techiepro.streams;
import java.util.regex.*;
import java.util.regex.Pattern;

public class RegexExample2 {

        public static void main(String args[]){

            String regex="^ *\\d+ *(?:, *\\d+ *)*$";
            System.out.println(Pattern.matches(regex, "234, "));//true (2nd char is s)

        }
}
