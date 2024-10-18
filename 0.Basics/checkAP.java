// Problem statement
// Given input consists of n numbers. Check whether those n numbers form an arithmetic progression or not. Print true or false.
// Detailed explanation ( Input/output format, Notes, Images )
// Input format :
// Line 1 : n
// Line 2 : n numbers
// Sample Input 1 :
// 6
// 2 6 10 14 18 22
// Sample Output 1 :
// true
// Sample Input 2 :
// 6
// 2 6 10 15 19 23
// Sample Output 2 :
// false

public class checkAP {

    public static char cap() {
        int[] arr = new int[] { 2, 6, 10, 14, 18, 22 };
        int gDif = arr[1] - arr[0];
        for (int i = 2; i < arr.length; i++) {
            int curDif = arr[i] - arr[i - 1];
            if (gDif != curDif)
                return 'f';
        }
        return 't';
    }
    
    public static void main(String[] args) {
        char ans = cap();
        System.out.println(ans);
    }
}
