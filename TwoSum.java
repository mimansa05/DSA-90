//brute force
class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int i=0;
        int j=1;
        int arr[]=new int[2];
        while(i<n-1)
        {
            if(nums[i]+nums[j]==target)
            {
                arr[0]=i;
                arr[1]=j;
                return arr;
            }
            else if(j==n-1)
            {
                i++;
                j=i+1;
            }
            else
            {
                j++;
            }

        }
        return arr;
    }
}

//optimal----> hashmap
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            hash.put(nums[i],i);
        }
        int arr[]=new int[2];
        for(int i =0;i<nums.length;i++)
        {
            int c=target-nums[i];
            if(hash.containsKey(c)==true && hash.get(c)!=i)
            {
                arr[0]=i;
                arr[1]=hash.get(c);
                return arr;
            }
        }
        return arr;
    }
}