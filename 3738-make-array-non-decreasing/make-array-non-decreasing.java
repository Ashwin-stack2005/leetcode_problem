class Solution {
    public int maximumPossibleSize(int[] nums) {
        int ans = 0;
        int prev = -1;
        for(int num:nums){
            if(num>=prev){
                prev = num;
                ans++;
            }
        }
        return ans;
    }
}