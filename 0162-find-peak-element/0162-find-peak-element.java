class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length == 1)
            return 0;
        int[] arr = Arrays.copyOfRange(nums,0,nums.length);
        Arrays.sort(arr);
        for(int i=1;i<nums.length;i++)
            if(nums[i-1]<nums[i] && nums[i] == arr[arr.length-1])
                return i;
        for(int i=0;i<nums.length-1;i++)
            if(nums[i]>nums[i+1] && nums[i] == arr[arr.length-1])
                return i;
        return -1;
    }
}