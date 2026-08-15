# 2352. Equal Row and Column Pairs

### Difficulty: Medium

## Description
Given a 0-indexed n x n integer matrix grid, return the number of pairs (ri, cj) such that row ri and column cj are equal.

A row and column pair is considered equal if they contain the same elements in the same order (i.e., an equal array).

 
Example 1:


Input: grid = [[3,2,1],[1,7,6],[2,7,7]]
Output: 1
Explanation: There is 1 equal row and column pair:
- (Row 2, Column 1): [2,7,7]


Example 2:


Input: grid = [[3,1,2,2],[1,4,4,5],[2,4,2,2],[2,4,2,2]]
Output: 3
Explanation: There are 3 equal row and column pairs:
- (Row 0, Column 0): [3,1,2,2]
- (Row 2, Column 2): [2,4,2,2]
- (Row 3, Column 2): [2,4,2,2]


 
Constraints:


	n == grid.length == grid[i].length
	1 <= n <= 200
	1 <= grid[i][j] <= 105

## Submission Details
- **Status**: Accepted
- **Runtime**: 231
- **Memory**: 30080000
- **Language**: cpp

## Code
```cpp
class Solution {
private:
    int isEqual(vector<int>& currentRow, vector<vector<int>>& grid, int col) {
        int ans = 0;
        for (int i = 0; i < col; i++) {
            int cnt = 0;
            for (int j = 0; j < col; j++) {
                if (currentRow[j] == grid[j][i]) {
                    cnt++;
                }
            }
            if (cnt == col) {
                ans++;
            }
        }
        return ans;
    }

public:
    int equalPairs(vector<vector<int>>& grid) {
        int row = grid.size();
        int col = row, cnt = 0;
        for (int i = 0; i < row; i++) {
            vector<int> currentRow(grid[i].begin(), grid[i].end());
            cnt += isEqual(currentRow, grid, col);
        }
        return cnt;
    }
};
```
