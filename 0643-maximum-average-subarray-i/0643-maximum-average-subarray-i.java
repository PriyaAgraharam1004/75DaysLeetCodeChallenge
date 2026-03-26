class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double win=0;
        for(int i=0;i<k;i++){
            win+=nums[i];
        }
        double max=win;
        for(int i=k;i<n;i++){
            win+=nums[i];
            win-=nums[i-k];
            max=Math.max(max,win);
        }
        return max/k;
    }
}