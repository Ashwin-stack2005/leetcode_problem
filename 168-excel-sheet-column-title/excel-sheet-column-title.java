class Solution {
    public String convertToTitle(int n) {
        StringBuilder ans=new StringBuilder();
        while(n>0){
            n--;
            int cur=n%26;
            ans.append((char)('A'+cur));
            n/=26;
        }
        return ans.reverse().toString();
    }
}