package com.techiepro.arrays;

import java.util.Arrays;
//sum closet to zero
public class ClosestToZero {
  public static void main(String[] args) {
	int[] a = { 1, 3, -5, 7, 8, 20, -40, 6 };
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
	int minimumSum = Integer.MAX_VALUE;
	int l = 0, r = a.length - 1;
	int minLeft = l, minRight = r;
	int sum = 0;
	while (l < r) {
	  sum = a[l] + a[r];
	  System.out.println(a[l]+" "+a[r]);
	  if (Math.abs(sum) < Math.abs(minimumSum)){
		System.out.print(l + "->" + r);
		System.out.println("Sum : "+sum+" Minimum Sum : "+minimumSum);
		minimumSum = Math.abs(sum);
		minLeft = l;
		minRight = r;
	  }
	  if (sum < 0) {
		l++;
	  } else {
		r--;
	  }
	}
	System.out.println(a[minLeft]+" : "+a[minRight]);
  }
}

