class Solution {
    public void sortColors(int[] nums) {
        for(int i=0;i<nums.length;i=i+1){
            for(int j=i+1;j<nums.length;j=j+1){
                if(nums[i]>nums[j]){
                    int siddyy=nums[i];
                    nums[i]=nums[j];
                    nums[j]=siddyy;
                }
            }
        }
    }
}