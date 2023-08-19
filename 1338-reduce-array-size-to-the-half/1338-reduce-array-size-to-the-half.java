class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int ele:arr)
            h.put(ele,h.getOrDefault(ele,0)+1);
        PriorityQueue<Integer> pq = new PriorityQueue<>((e1,e2)->e2-e1);
        
        h.forEach((k,v)->{
            pq.offer(v);
        });
        int sum = 0, count = 1;
        for(int i=0;i<h.size();i++){
            sum+=pq.peek();
            if(sum>=(arr.length/2))
                return count;
            ++count;
            pq.poll();
        }
        return count;
    }
}