// Problem statement
// Print the following pattern for given number of rows.
// Input format :
// Line 1 : N (Total number of rows)
// Sample Input :
//    5
// Sample Output :
// 1234554321
// 1234**4321
// 123****321
// 12******21
// 1********1


// package Patterns;

public class NumberStarPattern {
    public static void main(String[] args) {
        int x=6,s=0;
        for(int r=0; r<x; r++){
            for(int n=1; n<=x-r; n++){
                System.out.print(n);
            }
            for(int st=0; st<s; st++){
                System.out.print('*');
            }
            for(int rn=x-r; rn>0; rn--){
                System.out.print(rn);
            }
            System.out.println();
            s+=2;
        }
    }
}
