// Problem statement
// We are given a 4 digit number using digits 1 to 9. What is the maximum 3 digit number that we can make by removing one digit from the given integer.
// Detailed explanation ( Input/output format, Notes, Images )
// Sample Input :
// 5438
// Sample Output :
// 548
// Explanation :
// 1. If we remove 5, the new number is 438.
// 2. If we remove 4, the new number is 538.
// 3. If we remove 3, the new number is 548.
// 4. If we remove 8, the new number is 543.
// Out of the 4 cases removing 3 gives us the maximum 3 digit number i.e 548

public class maximumNumber {

    public static int getMax3DigitNo(int x){
        int[] arr = new int[4];
        for(int i=3; i>=0; i--){
            int temp=x%10;
            System.out.println("temp is: "+temp);
            x=x/10;
            arr[i]=temp;
        }
        System.out.println("arr is");
        for (int i : arr) {
            System.out.print(i+ " ");
        }
        int min = Integer.MAX_VALUE;
        for(int i=0; i<4; i++){
            if(arr[i]< min){
                min=arr[i];
            }
        }
        System.out.println("min value is: "+ min);
        int ans=0, pow=2;
        for(int i=0; i<4; i++){
            if(arr[i] == min) continue;
            ans = (arr[i] * (int)Math.pow(10, pow--)) + ans;
        }
        
        return ans;
    }
    public static void main(String[] args) {
        int x=9275;
        System.out.println(getMax3DigitNo(x));
    }
}
