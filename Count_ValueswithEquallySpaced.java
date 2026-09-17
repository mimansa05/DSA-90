import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public int countSpecialIntegers(int[] nums) {
        int n=nums.length;
        int count=0;
        HashMap<Integer,List<Integer>> hash=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(hash.containsKey(nums[i]))
            {
                hash.get(nums[i]).add(i);
            }
            else
            {
                hash.put(nums[i],new ArrayList<>());
                hash.get(nums[i]).add(i);
            }
            
        }
        for(List<Integer> list:hash.values())
            {
                if(list.size()==3)
                {
                    int i1=list.get(0);
                    int i2=list.get(1);
                    int i3=list.get(2);
                    if(i2-i1==i3-i2) count++;
                    
                }
                
            }
        return count;
    }
}©leetcode {
    
}
