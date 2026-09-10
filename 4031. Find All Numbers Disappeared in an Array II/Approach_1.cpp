class Solution {
public:
    vector<vector<int>> findDisappearedNumbers(vector<int>& nums, int lower, int upper) {
        vector<vector<int>> ans;
      
        int fixsize = 1e5;
        vector<int>hash(fixsize+1,0);

        for(int i = 0 ; i < nums.size(); i++){
            hash[nums[i]] = 1;
        }

        int start = lower;
        while(start <= upper){
            int end = start;
            while(end <= upper && hash[end] == 0) end++;
            if(start != end) {
                ans.push_back({start,end-1});
            }
            start = end + 1;
        }
        return ans;
    }
};