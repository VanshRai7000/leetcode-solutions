# 1207. Unique Number of Occurrences

### Difficulty: Easy

## Description
Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.

 
Example 1:


Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.

Example 2:


Input: arr = [1,2]
Output: false


Example 3:


Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
Output: true


 
Constraints:


	1 <= arr.length <= 1000
	-1000 <= arr[i] <= 1000

## Submission Details
- **Status**: Accepted
- **Runtime**: 0 ms
- **Memory**: 11980000
- **Language**: cpp

## Code
```cpp
class Solution {
public:
    bool uniqueOccurrences(vector<int>& arr) {
        unordered_map<int,int>mymap;
        for(int i = 0 ; i < arr.size(); i++){
            mymap[arr[i]]++;
        }
        
        unordered_set<int>myset;
        for(auto it : mymap){
            if(myset.contains(it.second) == false){
                myset.insert(it.second);
            }else{
                return false;
            }
        }
        return true;
    }
};
```
