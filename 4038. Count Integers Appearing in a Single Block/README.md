# 4038. Count Integers Appearing in a Single Block

### Difficulty: Easy

## Description
You are given an integer array nums.

An integer x is special if all occurrences of x in nums appear in a single contiguous block.

Return the number of distinct special integers in nums.

 
Example 1:


Input: nums = [1,2,2,1]

Output: 1

Explanation:


	1 appears at indices 0 and 3, forming two separate blocks, so it is not special.
	2 appears in a single contiguous block at indices [1, 2], so it is special.


Therefore, there is one special integer.


Example 2:


Input: nums = [3,3,1,2,2,1]

Output: 2

Explanation:


	3 appears in a single contiguous block at indices [0, 1], so it is special.
	1 appears at indices 2 and 5, forming two separate blocks, so it is not special.
	2 appears in a single contiguous block at indices [3, 4], so it is special.


Therefore, there are two special integers.


 
Constraints:


	1 <= nums.length <= 100
	1 <= nums[i] <= 100

## Submission Details
- **Status**: Accepted
- **Runtime**: 3
- **Memory**: 43620000
- **Language**: java

## Code
```java
class Solution {
    private boolean Checkforconsecutive(List<Integer> indxarr) {
        for (int i = 0; i < indxarr.size() - 1; i++) {
            if (indxarr.get(i+1) - indxarr.get(i) > 1)
                return false;
        }
        return true;
    }

    public int countSpecialIntegers(int[] nums) {
       
        int n = nums.length;
        Map<Integer, List<Integer>> mymap = new HashMap<>();

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (!mymap.containsKey(nums[i])) {
                mymap.put(nums[i], new ArrayList<>());
            }
            mymap.get(nums[i]).add(i);
        }

        for (Map.Entry<Integer, List<Integer>> e : mymap.entrySet()) {
            List<Integer> indxarr = e.getValue();
            if (Checkforconsecutive(indxarr) == true) {
                cnt++;
            }
        }
        return cnt;
    }
}
```
