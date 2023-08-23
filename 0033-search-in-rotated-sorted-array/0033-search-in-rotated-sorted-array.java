 class Solution {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            System.out.println(low+" "+high+" "+mid);
            if(nums[mid] == target)
                return mid;
            else if(nums[mid]>=nums[0]){
                if(target>=nums[0] && target < nums[mid])
                    high = mid-1;
                else
                    low = mid+1;
            }
            else{
                if(target>nums[mid] && target<=nums[nums.length-1])
                    low = mid+1;
                else
                    high = mid-1;
            }
        }
        return -1;
    }
}