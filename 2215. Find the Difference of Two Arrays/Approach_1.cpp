class Solution {
public:
    vector<vector<int>> findDifference(vector<int>& nums1, vector<int>& nums2) {
        set<int>myset1(nums1.begin(),nums1.end());
        set<int>myset2(nums2.begin(),nums2.end());

        vector<int>ans1,ans2;
        for(int val : myset1){
            if(myset2.count(val) == 0){
                ans1.push_back(val);
            }
        }
        for(int val : myset2){
            if(myset1.count(val) == 0){
                ans2.push_back(val);
            }
        }
        return {ans1,ans2};
    }
};