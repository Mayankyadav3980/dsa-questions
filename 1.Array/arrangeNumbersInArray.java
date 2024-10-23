// Problem statement
// You have been given an empty array(ARR) and its size N. The only input taken from the user will be N and you need not worry about the array.
// Your task is to populate the array using the integer values in the range 1 to N(both inclusive) in the order - 1,3,5,.......,6,4,2.

// Note:
// You need not print the array. You only need to populate it.
// Detailed explanation ( Input/output format, Notes, Images )
// Constraints :
// 1 <= t <= 10^2
// 0 <= N <= 10^4

// Time Limit: 1sec
// Sample Input 1 :
// 1
// 6
// Sample Output 1 :
// 1 3 5 6 4 2
// Explanation of Sample Input 1 :
// Since the value of N is 6, the number will be stored in the array in such a fashion that 1 will appear at 0th index, then 2 at the last index, in a similar fashion 3 is stored at index 1. Hence the array becomes 1 3 5 6 4 2.

public class arrangeNumbersInArray {

    public static void sortArr(int[]arr, int n){
       int cnt=1, l=0, r=n-1;
       while (l<=r) {
            if(cnt%2 == 1){
                arr[l]=cnt;
                cnt++;
                l++;
            }else{
                arr[r]=cnt;
                cnt++;
                r--;
            }
       }
    }

    public static void main(String[] args) {
        int[]arr = new int[5];
        sortArr(arr, 5);
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}
