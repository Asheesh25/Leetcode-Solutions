class Solution {
    public int findMiddleIndex(int[] nums) {
        int len = nums.length;
        int[] sum = new int[len];
        sum[0] = nums[0];
        for(int i=1;i<len;i++)
            sum[i] = sum[i-1]+nums[i];
        int ans = -1;
        for(int i=0;i<len;i++){
            if(i == 0){
                if(0 == sum[len-1]-sum[i]){
                    ans = 0;
                    break;
                }
            }
            else if(i == len-1){
                if(0 == sum[len-2]){
                    ans = len-1;
                }
            }
            else if(sum[i-1] == sum[len-1]-sum[i]){
                ans = i;
                break;
            }
        }
        return ans;
    }
}