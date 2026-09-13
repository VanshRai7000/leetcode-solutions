class Solution {
private:
    void RowShift(vector<vector<int>>& grid, int i, int k) {

        vector<int> row(grid[i].begin(), grid[i].end());
        k = k % grid.size();
        reverse(row.begin(), row.begin() + k);
        reverse(row.begin() + k, row.end());
        reverse(row.begin(), row.end());

        for (int j = 0; j < grid.size(); j++) {
            grid[i][j] = row[j];
        }
    }

    void ColShift(vector<vector<int>>& grid, int i, int k) {

        vector<int> col;
        k = k % grid.size();
        for (int j = 0; j < grid.size(); j++) {
            col.push_back(grid[j][i]);
        }

        reverse(col.begin(), col.begin() + k);
        reverse(col.begin() + k, col.end());
        reverse(col.begin(), col.end());

        for (int j = 0; j < grid.size(); j++) {
            grid[j][i] = col[j];
        }
    }

public:
    vector<vector<int>> cyclicShift(int n, vector<vector<int>>& grid,
                                    vector<int>& rowShift,
                                    vector<int>& colShift) {

        int row_cnt = rowShift.size();
        int col_cnt = row_cnt;

        for (int i = 0; i < row_cnt; i++) {
            RowShift(grid, i, rowShift[i]);
        }

        for (int i = 0; i < col_cnt; i++) {
            ColShift(grid, i, colShift[i]);
        }

        return grid;
    }
};