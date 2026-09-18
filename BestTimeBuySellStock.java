class Solution {
    //Kadanne Algoarithm
    public int maxProfit(int[] prices) {
        int minprice=prices[0];
        int maxi=0;
        int n=prices.length;
        for(int i=1;i<n;i++)
        {
            int pr=prices[i]-minprice;
            maxi=Math.max(maxi,pr);
            minprice=Math.min(minprice,prices[i]);

        }
        return maxi;
    }
}