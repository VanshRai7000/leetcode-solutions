class Solution {
public:
    long long shadowPairs(vector<int>& nums) {
        vector<int>st;
        long long ans = 0;

        for(int i = 0 ; i < nums.size(); i++){
            while(!st.empty() && st.back() > nums[i]){
                st.pop_back();
            }
            st.push_back(nums[i]);
            ans += lower_bound(st.begin(),st.end() , nums[i]) - st.begin();
        }
        
        return ans;
    }
};