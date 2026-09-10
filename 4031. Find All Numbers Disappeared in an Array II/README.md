# 4031. Find All Numbers Disappeared in an Array II

### Difficulty: Medium

## Description
You are given an integer array nums and two integers lower and upper.

A missing integer is an integer in the inclusive range [lower, upper] that does not appear in nums.

Return a 2D integer array where each element is of the form [start, end], representing a contiguous range of missing integers. Return the ranges in increasing order. If there are no missing integers, return an empty array.

Note: Consecutive missing integers should be grouped into a single range.

 
Example 1:


Input: nums = [3,9,7], lower = 1, upper = 12

Output: [[1,2],[4,6],[8,8],[10,12]]

Explanation:


	The missing integers are [1, 2, 4, 5, 6, 8, 10, 11, 12].
	Grouping the missing integers into the minimum number of contiguous ranges, we get [1, 2], [4, 6], [8, 8], and [10, 12].
	Therefore, the answer is [[1, 2], [4, 6], [8, 8], [10, 12]].



Example 2:


Input: nums = [1,1], lower = 5, upper = 7

Output: [[5,7]]

Explanation:


	The missing integers are [5, 6, 7].
	Grouping the missing integers into the minimum number of contiguous ranges, we get [5, 7].
	Therefore, the answer is [[5, 7]].



Example 3:


Input: nums = [2,3,5], lower = 2, upper = 3

Output: []

Explanation:


	There are no missing integers.
	Therefore, the answer is [].



 
Constraints:


	1 <= nums.length <= 105
	1 <= nums[i] <= 105
	1 <= lower <= upper <= 105

## Submission Details
- **Status**: Accepted
- **Runtime**: 158
- **Memory**: 312952000
- **Language**: cpp

## Code
```cpp
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
```
