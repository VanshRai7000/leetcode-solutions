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