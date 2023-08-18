class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int num:nums)
            h.put(num,h.getOrDefault(num,0)+1);
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]!=b[1]?a[1]-b[1]:b[0]-a[0]);
        
        h.forEach((k,v)->{
            pq.offer(new int[]{k,v});
        });
            
        int size = pq.size();
        int[] ans = new int[nums.length];
        int index = 0;
        
        
        for(int i=0;i<size;i++){
            int[] e = pq.poll();
            for(int j=0;j<e[1];j++){
                ans[index++] = e[0];
            }
        }
        
        return ans;
    }
}