// Problem statement
// Write a program to generate the reverse of a given number N. Print the corresponding reverse number.
// Note : If a number has trailing zeros, then its reverse will not include them. For e.g., reverse of 10400 will 
//be 401 instead of 00401.

// Detailed explanation ( Input/output format, Notes, Images )
// Constraints:
// 0 <= N < 10^8
// Sample Input 1 :
// 1234
// Sample Output 1 :
// 4321
// Sample Input 2 :
// 1980
// Sample Output 2 :
// 891

public class reverseANumber {
    public static void main(String[] args) {
        int n=4020, ans=0, temp;
        while (n>0) {
            temp=n%10;
            n/=10;
            ans = ans*10 + temp;
        }        
        System.out.println("204");
    }
}
