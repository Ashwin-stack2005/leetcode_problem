import java.util.*;

public class Solution {
    public String largestNumber(int[] nums) {
       ArrayList<String> arr = new ArrayList<>();
       for(int i=0;i<nums.length;i++)
       {
         arr.add(Integer.toString(nums[i]));
       }
       arr.sort((a,b)->{
          if((a+b).compareTo(b+a)>0) return -1;
          return 1;
       });
       String s = "";
       for(int i=0;i<arr.size();i++) 
       {
          s+=arr.get(i);
       }
       if(s.charAt(0)=='0') return "0";
       return s;
    }
}