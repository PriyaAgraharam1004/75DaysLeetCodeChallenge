class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n=nums.length;
            int max=nums[0];
            int min=nums[0];
            ArrayList<Integer> ls=new ArrayList<>();
            for(int i=0;i<n;i++){
                ls.add(nums[i]);
                max=Math.max(max,nums[i]);
                min=Math.min(min,nums[i]);
            }
            List<Integer> lst=new ArrayList<>();
            for(int i=min;i<=max;i++){
                if(!ls.contains(i)){
                    lst.add(i);
                }
            }
            return lst;
        }
        
    
}