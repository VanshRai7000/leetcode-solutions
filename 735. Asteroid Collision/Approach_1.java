class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
     
        Stack<Integer>st = new Stack<>();
        for(int i=0 ; i<n ; i++){
            if(asteroids[i] > 0){
                st.push(asteroids[i]);
            }else{
                while(!st.empty() && st.peek() > 0 && st.peek() < Math.abs(asteroids[i])){
                    st.pop();
                }
                if(!st.empty() && st.peek() > 0 && st.peek() == Math.abs(asteroids[i])){
                    st.pop();
                }
                else if(st.empty() == true || st.peek() < 0){
                    st.push(asteroids[i]);
                }
            }
        }

        int m = st.size();
        int ans[] = new int[m];
        
        if(st.isEmpty() == true){
            return ans;
        }

        for(int i = m - 1; i >= 0 ; i--){
            ans[i] = st.peek(); 
            st.pop();
        }

        return ans;
    }
}