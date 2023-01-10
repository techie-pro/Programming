package com.techiepro.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayByK_Inplace {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[] a = {1,2,3,4,5,6};
	System.out.println("Enter the no.of rotations");
	int k = sc.nextInt();
	int n= a.length;
	System.out.println(Arrays.toString(a));
	for (int i = 0; i < k; i++) {
	  // remember that you've written the below logic on your own, just think peacefully you'll get it :)
	  int temp = a[n-k+i];
	  a[n-k+i] = a[i];
	  a[i] = temp;
	  System.out.println(Arrays.toString(a));
	}
  }
}
