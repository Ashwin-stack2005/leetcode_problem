class Solution 
{
    public boolean isPalindrome(String s) 
    {
        String a = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        var left = 0;

        for (int right = a.length() - 1; right > 0; right--) 
        {
            if (a.charAt(right) != a.charAt(left)) 
            {
                return false;
            }
            left++;
        }
        return true;
    }
}