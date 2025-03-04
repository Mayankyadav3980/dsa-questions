// Problem statement
// You are given S, a sequence of n integers i.e. S = s1, s2, ..., sn. Compute if it is possible to split S into two parts : s1, s2, ..., si and si+1, si+2, ….., sn (0 <= i <= n) in such a way that the first part is strictly decreasing while the second is strictly increasing one.
// Note : We say that x is strictly larger than y when x > y. So, a strictly increasing sequence can be 1 4 8. However, 1 4 4 is NOT a strictly increasing sequence.

// That is, in the sequence if numbers are decreasing, they can start increasing at one point. Thereafter, they cannot decrease at any point further.
// Sequence made up of only increasing numbers or only decreasing numbers is a valid sequence. So, in both the cases, print true.

// You just need to print true/false. No need to split the sequence.
// Detailed explanation ( Input/output format, Notes, Images )
// Input format :
// Line 1 : Integer 'n'
// Line 2 and Onwards : 'n' integers on 'n' lines(single integer on each line)
// Output Format :
// "true" or "false" (without quotes)
// Constraints :
// 1 <= n <= 10^7
// Sample Input 1 :
// 5
// 9
// 8
// 4
// 5
// 6
// Sample Output 1 :
// true
// Sample Input 2 :
// 3
// 1
// 2
// 3
// Sample Output 2 :
// true

public class checkNumberSeq {
    public static void main(String[] args) {
        // int[] arr = { 1, 2, 3};
        int[] arr = { 3, 2, 1, 2, 3};
        int flag;
        boolean ans = true;

        if(arr[0]<arr[1]){
            flag= 1;
        }
        else{ flag=0; }

        int[] A = new int[arr.length-1];
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]==arr[i+1]){
                System.out.println('f');
            }
            A[i]= arr[i]-arr[i+1];
        }

        for(int i=0; i<A.length-1; i++){
            if(A[i]<0 && A[i+1]>0){
                System.out.println('f');
                // return 0;
            }
        }
        System.out.println('t');
        // return 1;

    }
}
