class Solution 
{
    public boolean isPalindrome(int x) 
    {
        int temp=x;
        if(x<0)
        {
            return false;
        }
     int reverse = 0 ;
     while (x!=0) 
     {
        int r = x % 10;
        reverse = reverse * 10 + r;
        x= x/10;
    }  
    if (temp ==reverse){
        return true;
    }
    else
    {
        return false;
    }  
}
}