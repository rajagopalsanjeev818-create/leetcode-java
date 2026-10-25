class Solution {
    public int minOperations(int[] nums) {
        int royal=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]-nums[i-1]<=0){
                int raj=(nums[i-1]-nums[i]+1);
                nums[i]+=raj;
                royal+=raj;
            }
        }
        return royal;
    }
}