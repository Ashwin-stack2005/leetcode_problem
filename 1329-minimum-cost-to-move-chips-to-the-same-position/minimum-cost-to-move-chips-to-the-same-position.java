class Solution {
    public int minCostToMoveChips(int[] nums) {
        int ec=0,oc=0;
        for(int e:nums){
            if((e&1)==0){
                ec++;
                continue;
            }
            oc++;
        }
        return Math.min(ec,oc);
    }
}