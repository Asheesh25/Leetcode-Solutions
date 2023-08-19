class Solution {
    
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((arr1,arr2)->arr2[1]-arr1[1]);
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int ele:nums)
            h.put(ele,h.getOrDefault(ele,0)+1);
        h.forEach((k1,v)->{
            pq.offer(new int[]{k1,v});
        });
        int[] ans = new int[k];
        for(int i=0;i<k;i++)
            ans[i] = pq.poll()[0];
        return ans;
    }
}