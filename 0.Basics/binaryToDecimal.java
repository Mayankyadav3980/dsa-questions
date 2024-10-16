// Problem statement
// Given a binary number as an integer N, convert it into decimal and print.
// Detailed explanation ( Input/output format, Notes, Images )
// Constraints :
// 0 <= N <= 10^9
// Sample Input 1 :
// 1100
// Sample Output 1 :
// 12
// Sample Input 2 :
// 111
// Sample Output 2 :
// 7


public class binaryToDecimal {
    public static void main(String[] args) {
        int n=111, ans=0, temp, pow=0;
        while (n>0) {
            temp = n%10;
            n/=10;
            ans += (int)temp*Math.pow(2, pow);
            pow++;
        }
        System.out.println(ans);
    }

}
