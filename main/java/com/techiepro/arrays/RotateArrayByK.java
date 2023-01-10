package com.techiepro.arrays;

import java.util.Arrays;

public class RotateArrayByK {
  public static void main(String[] args) {
	int[] a = {1, 2, 3, 4, 5, 6} ;
	int k = 2;
	int n = a.length;
	int[] result = new int[a.length];
	for(int i =0;i<n-k;i++){
	  result[i] = a[k+i];
	}
	int index = 0;
	for(int j =n-k; j<n;j++)
	{
	  result[j] = a[index++];
	}
	System.out.println(Arrays.toString(result));
  }
}
