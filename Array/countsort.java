import java.io.*;
import java.util.*;

public class countsort {

  public static void countSort(int[] arr, int min, int max) {
  int sofeq =(max - min) +1 ;
  int []frqArr= new int [sofeq];
  
  for( int i=0 ;i<arr.length ; i++ ) {
    frqArr[arr[i]-min]++;
  }
  for( int i=1 ;i<sofeq  ;i++  ) {
    frqArr[i]=frqArr[i-1] + frqArr[i];
  }
  int[] ans = new int[arr.length];
  for( int i=arr.length-1 ;i>-1  ;i--  ) {
     int arrEle = arr[i];
     int newIndex = frqArr[arrEle - min] -1;
      ans[newIndex] = arrEle;
      --frqArr[arrEle - min];
  }
  for (int i=0; i<arr.length; i++){
    arr[i] = ans[i];
  }
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
      max = Math.max(max, arr[i]);
      min = Math.min(min, arr[i]);
    }
    countSort(arr,min,max);
    print(arr);
  }

}