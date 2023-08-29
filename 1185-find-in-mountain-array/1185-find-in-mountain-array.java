/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int index = findIndex(mountainArr);
        int a = binSearch(mountainArr,0,index,target);
        int b = binSearch(mountainArr,index+1,mountainArr.length()-1,target);
        if(a!=-1)
            return a;
        if(b!=-1)
            return b;
        return -1;  
    }
    int binSearch(MountainArray m, int low, int high, int target){
        if(low == 0){
            while(low<=high){
                int mid = low + (high-low)/2;
                if(m.get(mid)==target)
                    return mid;
                else if(m.get(mid)<target)
                    low = mid+1;
                else
                    high = mid-1;
            }
        }
        else{
           while(low<=high){
                int mid = low + (high-low)/2;
                if(m.get(mid)==target)
                    return mid;
                else if(m.get(mid)>target)
                    low = mid+1;
                else
                    high = mid-1;
            } 
        }
        return -1;
    }
    int findIndex(MountainArray m){
        int low = 0, high = m.length()-1;
        while(low<high){
            int mid = low + (high-low)/2;
            if(m.get(mid)<m.get(mid+1))
                low = mid+1;
            else
                high = mid;
        }
        return low;
    }
}