class Solution {
    public int findMin(int[] nums) {
        int low = 0, high = nums.length-1,min = 5001;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]>=nums[low]){
                if(nums[low]<min)
                    min = nums[low];
                low = mid+1;
            }
            else{
                if(min>nums[mid])
                    min = nums[mid];
                high = mid-1;
            }
        }
        return min;
    }
}