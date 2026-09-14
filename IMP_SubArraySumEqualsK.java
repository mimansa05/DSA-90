import java.util.HashMap;
class IMP_SubArraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hash=new HashMap<>();
        int count=0;
        int n=nums.length;
        int psum=0;
        hash.put(0,1);
        for(int i=0;i<n;i++)
        {
            psum+=nums[i];
            int rem=psum-k;
            if(hash.containsKey(rem))
            {
                count+=hash.get(rem);
            }
            hash.put(psum,hash.getOrDefault(psum,0)+1);
        }
        return count;
    }
}