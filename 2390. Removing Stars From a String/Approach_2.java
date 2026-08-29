class Solution {
    public String removeStars(String s) {

        int n = s.length();
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != '*') {
                st.push(s.charAt(i));
            } else {
                st.pop();
            }
        }

        String ans = "";

        while (!st.isEmpty()) {
            Character element = st.peek();
            st.pop();
            ans += element;
        }
        String reversed = new StringBuffer(ans).reverse().toString();
        return reversed;

    }
}