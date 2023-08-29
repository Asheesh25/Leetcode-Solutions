class Solution {
    public int findMin(int[] nums) {
        int len = nums.length;
        if(nums[0]<nums[len-1])
            return nums[0];
        int low = 0, high = len-1;
        while(low<high){
            int mid = low + (high-low)/2;
            if(nums[mid]>=nums[0])
                low = mid+1;
            else
                high = mid;
        }
        return nums[low];
    }
}