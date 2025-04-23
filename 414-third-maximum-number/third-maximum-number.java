class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> s=new HashSet<>();
        for(int i:nums){
            s.add(i);
        }
        int k=0;
        int[] a=new int[s.size()];
        for(int i:s){
            a[k]=i;
            k++;
        }
        Arrays.sort(a);
        if(a.length<3) return a[a.length-1];
        return a[a.length-3];
    }
}