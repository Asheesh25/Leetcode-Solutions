class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(search(arr,arr[i],i))
                return true;
        }
        return false;
    }
    boolean search(int[] arr, int ele,int index){
        int low = 0, high = arr.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(ele == 0 && arr[mid] == 0 && mid!=index)
                return true;
            if(arr[mid] == 2*ele && arr[mid]!=0 )
                return true;
            else if(arr[mid]>2*ele)
                high = mid-1;
            else
                low = mid+1;
        }
        return false;
    }
}