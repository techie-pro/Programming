package com.techiepro.arrays;

public class SecondHighest {
  public static void main(String[] args) {

  int[] arr = {12,2,3,25,56,0,1,95,98,98};
  int highest = Integer.MIN_VALUE;
  int secondHighest = Integer.MAX_VALUE;
  int len = arr.length;
  for(int i =0;i<len;i++){
    if(arr[i] > highest){
      secondHighest = highest;
      highest = arr[i];
    }
    else if(arr[i] > secondHighest && arr[i] != highest){
      secondHighest = arr[i];
    }
  }
  System.out.print(secondHighest);
  }
}
