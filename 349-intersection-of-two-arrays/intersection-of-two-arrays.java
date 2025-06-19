class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet();
        
        for(int n:nums1)
        set.add(n);

        List<Integer> l=new ArrayList<>();
        for(int n:nums2){
            if(set.contains(n)){
                l.add(n);
                set.remove(n);
            }
        }
        int ar[]=new int[l.size()];
        int i=0;
        for(int c:l){
            ar[i++]=c;
        }
        return ar;
    }
}