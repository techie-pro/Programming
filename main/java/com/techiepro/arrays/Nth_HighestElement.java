package com.techiepro.arrays;

import java.util.*;

public class Nth_HighestElement {

  //get any Nth element of smallest and highest, just changing the sorted order !
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int nth = sc.nextInt();

	Integer[] a = {23,43,54,21,67,45,76,12};

	List<Integer> al  = Arrays.asList(a);
	Integer final1 = al.stream().distinct().sorted(Collections.reverseOrder()).skip(nth).findFirst().get();
	System.out.println(final1);


  }
}
