import java.io.*;
import java.util.*;

public class smallestNumberFollowingPattern {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int num = 1;
        Stack<Integer> sta = new Stack<>();
        // ArrayList<Integer> que = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'd') {
                sta.push(num);
                // System.out.println("pushing:" + num);
                num++;
            } else {
                sta.push(num);
                // System.out.println("pushing:" + num);
                num++;
                while (sta.size() > 0) {
                    // System.out.println("poping:");
                    System.out.print(sta.pop());
                }
            }
        }
        sta.push(num);
        while (sta.size() > 0) {
            System.out.print(sta.pop());
        }
    }
}