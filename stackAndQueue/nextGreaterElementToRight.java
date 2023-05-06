
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class nextGreaterElementToRight {
    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val : a) {
            sb.append(val + "\n");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        int[] nge = solve(a);
        display(nge);
    }

    public static int[] solve(int[] arr) {
        int s = arr.length;
        int[] nge = new int[s];
        nge[s - 1] = -1;

        Stack<Integer> st = new Stack<>();
        st.push(nge[s - 1]);

        for (int i = s - 2; i >= 0; i--) {
            while (st.size() > 0 && st.peek() <= arr[i]) {
                st.pop();
            }

            if (st.size() == 0) {
                nge[i] = -1;
            } else {
                nge[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return nge;
    }

}