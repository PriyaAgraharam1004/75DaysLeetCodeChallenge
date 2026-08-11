class Solution {
    public int missingInteger(int[] nums) {
        int n=nums.length;
        Set<Integer> st=new HashSet<>();
        for(int num:nums){
            st.add(num);
        }
        int prefixlen=1;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]+1){
                prefixlen+=1;
            }
            else{
                break;
            }
        }
        int total=((nums[prefixlen-1]+nums[0])*prefixlen)/2;
        while(st.contains(total)){
            total+=1;
        }
        return total;
    }
}