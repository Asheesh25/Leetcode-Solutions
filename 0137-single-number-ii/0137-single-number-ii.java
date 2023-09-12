class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int num:nums)
            h.put(num,h.getOrDefault(num,0)+1);
        for(int a:h.keySet()){
            int val = h.get(a);
            if(val == 1)
                return a;
        }
        return -1;
    }
}