package com.techiepro.strings;

public class Substring {

  public static void main(String[] args) {
	String str = "abcdefg";

	int len = str.length();
	for (int i = 0; i < len; i++) {
	  String subStr = "";
	  for (int j=i;j< len;j++){
		subStr += str.charAt(j);
          System.out.println(subStr);
      }
	}

  }
}
