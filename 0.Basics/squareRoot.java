// Problem statement
// Given a number N, find its square root. You need to find and print only the integral part of square root of N.
// For eg. if number given is 18, answer is 4.
// Detailed explanation ( Input/output format, Notes, Images )
// Constraints :
// 0 <= N <= 10^8
// Sample Input 1 :
// 10
// Sample Output 1 :
// 3

public class squareRoot {
    public static void main(String[] args) {
        int x=25, ans=0;
        while (ans*ans<=x) {
            ans++;
        }
        System.out.println(ans-1);
    }
}
