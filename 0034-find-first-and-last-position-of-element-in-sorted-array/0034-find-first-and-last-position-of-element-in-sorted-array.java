class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        ans[0] = leftIndex(nums,target);
        ans[1] = rightIndex(nums,target);
        return ans;
    }
    int leftIndex(int[] arr,int ele){
        int low = 0, high = arr.length-1,index = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid] == ele){
                index = mid;
                high = mid-1;
            }
            else if(arr[mid]>=ele)
                high = mid-1;
            else
                low = mid+1;
        }
        return index;
    }
    int rightIndex(int[] arr,int ele){
        int low = 0, high = arr.length-1,index = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid] == ele){
                index = mid;
                low = mid+1;
            }
            else if(arr[mid]<ele)
                low = mid+1;
            else
                high = mid-1;
        }
        return index;
    }
}