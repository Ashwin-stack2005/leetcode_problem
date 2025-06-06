class Solution {
public:
    vector<int> shuffle(vector<int>& nums, int n) {
        
        vector<int> res(nums.size(), 0);

        for(int i = 0; i<n; i++){
            res[2*i] = nums[i] ;
            res[2*i+1] = nums[n+i];
        }

        return res;
    }
};