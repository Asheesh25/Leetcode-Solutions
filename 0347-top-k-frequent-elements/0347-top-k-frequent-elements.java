class Solution {
    
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int ele:nums)
            h.put(ele,h.getOrDefault(ele,0)+1);
        PriorityQueue<int[]> q = new PriorityQueue<>((a,b)->b[1]-a[1]);
        h.forEach((k1,v)->{
            q.offer(new int[]{k1,v});
        });
        int[] ans = new int[k];
        for(int i=0;i<k;i++)
            ans[i] = q.poll()[0];
        return ans;
    }
}