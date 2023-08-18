class Solution {
    static class Pair{
        int num;
        int count;
        Pair(int num,int count){
            this.num = num;
            this.count = count;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> h = new HashMap<>();
        int[] ans = new int[k];
        for(int num:nums)
            h.put(num,h.getOrDefault(num,0)+1);
        ArrayList<Pair> al = new ArrayList<>();
        h.forEach((key, value) -> {
            al.add(new Pair(key,value));
        });
        al.sort((p1,p2)->p2.count - p1.count);
        int count = 0;
        for(Pair p:al){
            if(count>=k)
                break;
            ans[count++] = p.num;
        }
        return ans;
    }
}