// Sample Input 1 :
// 12
// Sample Output 1 :
// 1100
// Sample Input 2 :
// 7
// Sample Output 2 :
// 111

public class decimalToBinary {
    public static void main(String[] args) {
        int n=2, temp;
        String ans="";

        while (n>0) {
            temp= n%2;
            n/=2;
            ans= temp + ans;
        }
        System.out.println(ans);
    }
}
