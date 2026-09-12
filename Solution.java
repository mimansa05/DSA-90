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
                if(list.size()>=3)
                {
                   int d=list.get(1)-list.get(0);
                    boolean flag=true;
                    for(int i=2;i<list.size();i++)
                    {
                        if(list.get(i)-list.get(i-1)!=d)
                        {
                            flag=false;
                        }
                    }
                    if(flag) count++;
                }
            }
        return count;
    }
}©leetcode {
    
}
