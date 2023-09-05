class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[] arr = Arrays.copyOfRange(score,0,score.length);
        Arrays.sort(arr);
        String[] ans = new String[score.length];
        for(int i=0;i<score.length;i++){
            if(score[i] == arr[arr.length-1])
                ans[i] = "Gold Medal";
            else if(score[i] == arr[arr.length-2])
                ans[i] = "Silver Medal";
            else if(score[i] == arr[arr.length-3])
                ans[i] = "Bronze Medal";
            else
                ans[i] = String.valueOf(binSearch(score[i],arr));
        }
        return ans;
    }
    int binSearch(int ele, int[] arr){
        int low = 0, high = arr.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid] == ele)
                return arr.length-mid;
            else if(arr[mid]<ele)
                low = mid+1;
            else high = mid-1;
        }
        return -1;
    }
}