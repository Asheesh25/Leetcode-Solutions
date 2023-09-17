class Solution {
    public int[] sortByBits(int[] arr) {
       PriorityQueue<int[]> pq = new PriorityQueue<>((arr1,arr2)->arr1[1]!=arr2[1]?arr1[1]-arr2[1]:arr1[0]-arr2[0]);
       for(int i=0;i<arr.length;i++){
           int ans = count(arr[i]);
           pq.add(new int[]{arr[i],ans});
       }
       int size = pq.size();
       int[] ans = new int[size];
       for(int i=0;i<size;i++)
            ans[i] = pq.remove()[0];
       return ans;
    }
    int count(int num){
        int ans = 0;
        for(int i=0;i<32;i++){
            int a = (num>>i) & 1;
            if(a == 1)
                ans++;
        }
        return ans;
    }
}