class Solution {
    public int singleNonDuplicate(int[] nums) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int num:nums)
            h.put(num,h.getOrDefault(num,0)+1);
        for(Map.Entry m : h.entrySet())  
            if(m.getValue() == (Integer)1)
                return (int)m.getKey();
        return -1;
    }
}