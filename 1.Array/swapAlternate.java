// Problem statement
// You have been given an array/list(ARR) of size N. You need to swap every pair of alternate elements in the array/list.
// You don't need to print or return anything, just change in the input array itself.
// Detailed explanation ( Input/output format, Notes, Images )
// Constraints :
// 1 <= t <= 10^2
// 0 <= N <= 10^5
// Time Limit: 1sec
// Sample Input 1:
// 1
// 6
// 9 3 6 12 4 32
// Sample Output 1 :
// 3 9 12 6 32 4
// Sample Input 2:
// 2
// 9
// 9 3 6 12 4 32 5 11 19
// 4
// 1 2 3 4
// Sample Output 2 :
// 3 9 12 6 32 4 11 5 19 
// 2 1 4 3 

public class swapAlternate {

    public static void swapAlt(int[]arr){
        for(int i=1; i<arr.length; i+=2){
            int temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[]={9, 3, 6, 12, 4, 32};
        swapAlt(arr);
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}
