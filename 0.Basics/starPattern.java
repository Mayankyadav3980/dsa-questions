// Problem statement
// Print the following pattern for given number of rows.
// Detailed explanation ( Input/output format, Notes, Images )
// Input format :
// Integer N (Total number of rows)
// Output Format :
// Pattern in N lines
// Sample Input :
//    5
// Sample Output :
//  5432*
//  543*1
//  54*21
//  5*321
//  *4321

public class starPattern {
    public static void main(String[] args) {
        for(int r=1; r<=5; r++){
            for(int c=5; c>=1; c--){
                if(c==r)
                    System.out.print('*');
                else
                    System.out.print(c);
            }
            System.out.println();
        }
    }
}
