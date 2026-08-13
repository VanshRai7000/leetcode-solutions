class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        int n = nums.size();
        sort(nums.begin(),nums.end());
        for (int i = 0; i < n-1; i++) {
            int j = i + 1;
            if(nums[i] == nums[j]){
                return true;
            }
        }
        return false;
    }
};