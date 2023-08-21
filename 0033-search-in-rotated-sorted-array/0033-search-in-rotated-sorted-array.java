class Solution {
    public int search(int[] nums, int target) {
        if(target<nums[0]){
            int low = 0, high = nums.length-1;
            while(low<=high){
                int mid = low + (high-low)/2;
                if(nums[mid] == target)
                    return mid;
                else if((nums[mid]>target && nums[mid]>nums[nums.length-1]) || nums[mid]<target)
                    low = mid+1;
                else
                    high = mid-1;
            }
            return -1;
        }
        else{
           int low = 0, high = nums.length-1;
            while(low<=high){
                int mid = low + (high-low)/2;
                if(nums[mid] == target)
                    return mid;
                else if(nums[mid]>target || (nums[mid]<target && nums[mid]<nums[0]))
                    high = mid-1;
                else
                    low = mid+1;
            }
            return -1; 
        }
    }
}