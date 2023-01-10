package com.techiepro.arrays;

public class SmallestAndLargest {

  public static void main(String[] args) {

  int[] arr = {12,2,3,100,25,56,0,-1,98};
  int smallest = arr[0];
  int largest = arr[0];

  for(int i=0;i<arr.length;i++){
    if(arr[i] > largest) {
      largest = arr[i];
    }
    else if(arr[i] < smallest){
      smallest = arr[i];
    }
  }
  System.out.println(smallest+":"+largest );
  }
}
