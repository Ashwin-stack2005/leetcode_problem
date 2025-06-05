class Solution {
    public String reverseStr(String s, int k) {
        char[]a = s.toCharArray();
        for(int i = 0; i < a.length; i += 2 * k)
        {
            int l = i;
            int e = Math.min(i + k - 1, a.length-1);
            while( l < e)
            {
                char temp = a[l];
                a[l] = a[e];
                a[e] = temp;
                l++;
                e--;                
            }
        }
        s = new String(a);
        return s;
    }
}