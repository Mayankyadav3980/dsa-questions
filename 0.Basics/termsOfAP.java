// Problem statement
// Write a program to print the first x terms of the mathematical series 3N + 2 which are not multiples of 4.
// The series is defined as:
// T(N) = 3N + 2, where N is a positive integer starting from 1. Your task is to print the first x terms
// of this series, but you should exclude any term that is a multiple of 4.
// Detailed explanation ( Input/output format, Notes, Images )
// Constraints :
// 1 <= x <= 1,000
// Sample Input 1 :
// 10
// Sample Output 1 :
// 5 11 14 17 23 26 29 35 38 41

/**
 * termsOfAP
 */
public class termsOfAP {

    public static void main(String[] args) {
        int x = 5, i = 1, t = 1;
        while (t <= x) {
            int val = (3 * i + 2);
            if (val % 4 != 0) {
                System.out.print(val + " ");
                t++;
            }
            i++;
        }
    }
}