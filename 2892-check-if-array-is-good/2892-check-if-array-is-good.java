class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int num = nums.length;
        if(nums[num-1]!=num-1)
            return false;
        if(nums[num-1] !=num-1 || nums[num-2]!=num-1)
            return false;
        for(int i=0;i<num-2;i++)
            if(nums[i]!=i+1)
                return false;
        return true;
    }
}