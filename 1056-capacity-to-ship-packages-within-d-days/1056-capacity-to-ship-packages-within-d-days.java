class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max = 0, sum = 0;
        for(int wt:weights){
            if(wt>max)
                max = wt;
            sum+=wt;
        }
        int  low = max, high = sum;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(fun(mid,weights)>days)
                low = mid+1;
            else
                high = mid-1;
        }
        return low;
    }
    int fun(int capacity, int[] arr){
        int day = 1, load = 0;
        for(int i=0;i<arr.length;i++){
            if(load+arr[i]<=capacity)
                load+=arr[i];
            else{
                day+=1;
                load = arr[i];
            }
        }
        return day;
    }
}