// Problem statement
// Create a function that determines whether a given number N belongs to the Fibonacci sequence. If N is found in the Fibonacci sequence, the function should return true; otherwise, it should return false.

// Detailed explanation ( Input/output format, Notes, Images )
// Constraints :
// 0 <= n <= 10^4
// Sample Input 1 :
// 5
// Sample Output 1 :
// true
// Explanation :
// Fibonacci sequence begins 0, 1, 1, 2, 3, 5, ... and so on. Since 5 appears in the sequence.
// Sample Input 2 :
// 14
// Sample Output 2 :
// false    

public class fibonacciMember {

    public static boolean fm(int x){
        if(x==0 || x==1) return true;
        int a=0, b=1, temp=0;
        while (temp<=x) {
            temp= a+b;
            b=a;
            a=temp;
            
            if(temp == x){
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int x=14;
        System.out.println(fm(x));
    }
}
