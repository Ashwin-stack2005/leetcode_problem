class Solution {
public:
    int uniquePaths(int m, int n) {
        vector<vector<int>> arr(m, vector<int>(n, 0));
        arr[0][0] = 1;
        for (int i=0; i<m; i++) {
            for (int x=0; x<n; x++) {
                if (i+1 < m) {
                    arr[i+1][x] += arr[i][x];
                }
                if (x+1 < n) {
                    arr[i][x+1] += arr[i][x];
                }
            }
        }
        return arr[m-1][n-1];
    }
};