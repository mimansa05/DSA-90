class Find_PivotIndex {//----using prefix sum
    public int pivotIndex(int[] nums) {
        //logic: total=left+right+current
        //right=total-left-current
        int total=0;
        int n=nums.length;
        for(int x:nums)
        {
            total+=x;
        }
        int lsum=0;
        for(int i=0;i<n;i++)
        {
            int rsum=total-lsum-nums[i];
            if(lsum==rsum) return i;
            lsum+=nums[i];
        }
        return -1;
    }
}