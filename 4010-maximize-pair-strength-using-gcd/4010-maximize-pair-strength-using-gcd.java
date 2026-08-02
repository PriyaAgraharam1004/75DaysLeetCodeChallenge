class Solution {
    public long maxPairStrength(int[] nums) {
       int n=nums.length;
        
        long max=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                long a=gcd(nums[i],nums[j]);
                long ans=(1L*nums[i]*nums[j])/(a*a);
                max=Math.max(max,(long)ans);
            }
        }
        return max;
    }
    public long gcd(long a,long b){
        while(b!=0){
            long t=b;
            b=a%b;
            a=t;
        }
        return a;
    }
}