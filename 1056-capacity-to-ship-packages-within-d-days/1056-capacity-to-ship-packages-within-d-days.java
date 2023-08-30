class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sum = 0,max = 0;
        for(int num:weights){
            sum+=num;
            max = num>max?num:max;
        }
        int[] arr = new int[sum-max+1];
        int index = 0;
        for(int i=max;i<=sum;i++)
            arr[index++] = i;
        for(int i=1;i<weights.length;i++)
            weights[i]+=weights[i-1];
        int low = 0, high = arr.length-1;
        while(low<high){
            int mid = low + (high-low)/2;
            if(count(weights,arr[mid])>days)
                low = mid+1;
            else
                high = mid;
        }
        return arr[low];
    }
    int count(int[] arr, int target){
        int index = 0, ans = 0,init = 0;
        while(index<arr.length){
            if(arr[index]-init<target){
                if(index == arr.length-1){
                    ans++;
                    break;
                }
                index++;
            }
            else if(arr[index]-init>target){
                ans+=1;
                index--;
                init = arr[index];
            }
            else{
                ans+=1;
                init = arr[index];
                index++;
            }
        }
        return ans;
    }
}