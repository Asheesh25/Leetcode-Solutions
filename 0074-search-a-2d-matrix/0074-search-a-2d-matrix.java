class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low = 0, high = matrix.length-1, lastIndex = matrix[0].length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(target>matrix[mid][lastIndex])
                low = mid+1;
            else if(target<matrix[mid][0])
                high = mid-1;
            else{
                if(binSearch(matrix[mid],target))
                    return true;
                return false;
            }
        }
        return false;
    }
    boolean binSearch(int[] arr, int target){
        int low = 0, high = arr.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid] == target)
                return true;
            else if(arr[mid]<target)
                low = mid+1;
            else
                high = mid-1;
        }
        return false;
    }
}