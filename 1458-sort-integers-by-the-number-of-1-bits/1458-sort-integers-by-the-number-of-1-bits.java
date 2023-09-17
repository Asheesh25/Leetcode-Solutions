class Solution {
    public int[] sortByBits(int[] arr) {
       PriorityQueue<int[]> pq = new PriorityQueue<>((arr1,arr2)->arr1[1]!=arr2[1]?arr1[1]-arr2[1]:arr1[0]-arr2[0]);
       for(int i=0;i<arr.length;i++)
           pq.add(new int[]{arr[i],Integer.bitCount(arr[i])});
       int size = pq.size();
       int[] ans = new int[size];
       for(int i=0;i<size;i++)
            ans[i] = pq.remove()[0];
       return ans;
    }
}